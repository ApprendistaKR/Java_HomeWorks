package com.schedules_2.User.Dto.ResponseDto;

import lombok.Getter;

@Getter
public class SessionUserDto {
    private final Long id;
    private final String name;
    private final String email;

    public SessionUserDto(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

}
