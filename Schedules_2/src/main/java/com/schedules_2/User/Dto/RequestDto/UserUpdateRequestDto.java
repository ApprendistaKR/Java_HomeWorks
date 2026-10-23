package com.schedules_2.User.Dto.RequestDto;

import com.schedules_2.User.Dto.ResponseDto.UserUpdateResponseDto;
import lombok.Getter;

@Getter
public class UserUpdateRequestDto {
    private String name;
    private String email;
    private String password;

    public UserUpdateRequestDto(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;

    }
}
