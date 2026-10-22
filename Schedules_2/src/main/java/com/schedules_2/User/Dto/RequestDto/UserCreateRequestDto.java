package com.schedules_2.User.Dto.RequestDto;

import lombok.Getter;

@Getter
public class UserCreateRequestDto {
    private String name;
    private String email;

    public UserCreateRequestDto(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
