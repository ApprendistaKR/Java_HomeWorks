package com.schedules_2.User;

import com.schedules_2.User.Dto.RequestDto.UserCreateRequestDto;
import com.schedules_2.User.Dto.ResponseDto.UserCreateResponseDto;
import com.schedules_2.User.Entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Locale;

@Service
@RequiredArgsConstructor
public class UserService {
    //속성
    private final UserRepository userRepository;

    //생성자
    @Transactional
    public UserCreateResponseDto createUser(UserCreateRequestDto requestDto) {
        User user = new User(
                requestDto.getName(),
                requestDto.getEmail()
        );
        User savedUser = userRepository.save(user);
        UserCreateResponseDto responseDto = new UserCreateResponseDto(savedUser.getId());
        return responseDto;

    }
}
