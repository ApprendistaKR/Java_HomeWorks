package com.schedules_2.User;

import com.schedules_2.User.Dto.RequestDto.UserCreateRequestDto;
import com.schedules_2.User.Dto.ResponseDto.UserCreateResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping
    public ResponseEntity<UserCreateResponseDto> create(@RequestBody UserCreateRequestDto requestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(requestDto));
    }
}
