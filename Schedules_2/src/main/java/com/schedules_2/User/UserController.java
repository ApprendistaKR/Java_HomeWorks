package com.schedules_2.User;

import com.schedules_2.User.Dto.RequestDto.UserCreateRequestDto;
import com.schedules_2.User.Dto.RequestDto.UserLoginRequestDto;
import com.schedules_2.User.Dto.RequestDto.UserUpdateRequestDto;
import com.schedules_2.User.Dto.ResponseDto.*;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    //속성
    private final UserService userService;

    //생성자
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //기능

    //유저 생성
    @PostMapping
    public ResponseEntity<UserCreateResponseDto> create(@RequestBody UserCreateRequestDto requestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(requestDto));
    }

    //유저 로그인
    @PostMapping("/login")
    public ResponseEntity<Void> login(@Validated @RequestBody UserLoginRequestDto request, HttpSession session) {
        SessionUserDto sessionUser = userService.login(request);
        session.setAttribute("loginUser", sessionUser);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    //유저 로그아웃
    @PostMapping("/logout")
    public ResponseEntity<Void> logout(
            @SessionAttribute(name = "loginUser", required = false)
            SessionUserDto sessionUser,
            HttpSession session
    ) {
        if (sessionUser == null) {
            return ResponseEntity.badRequest().build();
        }

        session.invalidate();
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


    //전체 조회
    @GetMapping
    public ResponseEntity<List<UserGetAllResponseDto>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(userService.findAll());
    }

    //단건 조회
    @GetMapping("/{userId}")
    public ResponseEntity<UserGetOneResponseDto> getOne(
            @PathVariable Long userId
    ) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.findOne(userId));
    }

    //유저 수정
    @PutMapping("/{userId}")
    public ResponseEntity<UserUpdateResponseDto> update(
            @PathVariable Long userId,
            @RequestBody UserUpdateRequestDto request
    ) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.update(userId, request));
    }

    //유저 삭제
    @DeleteMapping("/{userId}")
    public void delete(
            @PathVariable Long userId
    ) {
        userService.delete(userId);
    }
}


