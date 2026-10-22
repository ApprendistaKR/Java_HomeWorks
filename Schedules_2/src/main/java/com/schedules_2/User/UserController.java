package com.schedules_2.User;

import com.schedules_2.User.Dto.RequestDto.UserCreateRequestDto;
import com.schedules_2.User.Dto.RequestDto.UserUpdateRequestDto;
import com.schedules_2.User.Dto.ResponseDto.UserCreateResponseDto;
import com.schedules_2.User.Dto.ResponseDto.UserGetAllResponseDto;
import com.schedules_2.User.Dto.ResponseDto.UserGetOneResponseDto;
import com.schedules_2.User.Dto.ResponseDto.UserUpdateResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
}


