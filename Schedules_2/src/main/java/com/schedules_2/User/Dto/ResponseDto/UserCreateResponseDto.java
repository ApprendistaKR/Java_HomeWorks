package com.schedules_2.User.Dto.ResponseDto;

import lombok.Getter;

@Getter
public class UserCreateResponseDto {
    private final Long id;

    public UserCreateResponseDto(Long id) {
        this.id = id;
    }
}
