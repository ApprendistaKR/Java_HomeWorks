package com.schedules_2.User.Dto.RequestDto;

import com.schedules_2.User.Dto.ResponseDto.UserUpdateResponseDto;
import lombok.Getter;

@Getter
public class UserUpdateRequestDto {
    private String name;
    private String email;

    public UserUpdateRequestDto(String name, String email) {
        this.name = name;
        this.email = email;

    }
}
