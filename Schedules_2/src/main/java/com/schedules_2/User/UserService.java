package com.schedules_2.User;

import com.schedules_2.User.Dto.RequestDto.UserCreateRequestDto;
import com.schedules_2.User.Dto.RequestDto.UserLoginRequestDto;
import com.schedules_2.User.Dto.RequestDto.UserUpdateRequestDto;
import com.schedules_2.User.Dto.ResponseDto.*;
import com.schedules_2.User.Entity.User;
import com.schedules_2.schedule.Entity.Schedule;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;
import java.util.Locale;

@Service
@RequiredArgsConstructor
public class UserService {
    //속성
    private final UserRepository userRepository;

    //생성자

    //유저 생성
    @Transactional
    public UserCreateResponseDto createUser(UserCreateRequestDto requestDto) {

        if (requestDto.getPassword() == null || requestDto.getPassword().length() < 8) {
            throw new IllegalArgumentException("비밀번호는 8자 이상이어야 합니다.");
        }

        User user = new User(
                requestDto.getName(),
                requestDto.getEmail(),
                requestDto.getPassword()
        );
        User savedUser = userRepository.save(user);
        UserCreateResponseDto responseDto = new UserCreateResponseDto(savedUser.getId());
        return responseDto;

    }

    //전제 조회
    @Transactional(readOnly = true)
    public List<UserGetAllResponseDto> findAll() {
        List<User> users = userRepository.findAll();
        return users.stream().map(user -> new UserGetAllResponseDto(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getCreateAt(),
                user.getModifiedAt()
        )).toList();

    }

    //단건 조회
    @Transactional(readOnly = true)
    public UserGetOneResponseDto findOne(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(
                () -> new IllegalStateException("존재하지 않는 유저입니다.")
        );
        return new UserGetOneResponseDto(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getCreateAt(),
                user.getModifiedAt()
        );
    }

    //유저 수정
    @Transactional
    public UserUpdateResponseDto update(Long userId, UserUpdateRequestDto request) {

        User user = userRepository.findById(userId).orElseThrow(
                () -> new IllegalStateException("존재하지 않는 유저입니다.")
        );

        if (!request.getPassword().equals(user.getPassword())) {
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        }

        if (request.getPassword() == null || request.getPassword().length() < 8) {
            throw new IllegalArgumentException("비밀번호는 8자 이상이어야 합니다.");
        }

        user.updateNameEmail(
                request.getName(),
                request.getEmail()
        );
        return new UserUpdateResponseDto(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getCreateAt(),
                user.getModifiedAt()
        );
    }

    //일정 삭제
    @Transactional
    public void delete(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(
                () -> new IllegalStateException("존재하지 않는 유저입니다.")
        );
        userRepository.deleteById(userId);
    }

    // 로그인 기능
    @Transactional(readOnly = true)
    public SessionUserDto login(@Validated UserLoginRequestDto requestDto) {
        User user = userRepository.findByEmail(requestDto.getEmail()).orElseThrow(
                () -> new IllegalStateException("존재하지 않는 유저입니다.")
        );

        return new SessionUserDto(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
    }

}
