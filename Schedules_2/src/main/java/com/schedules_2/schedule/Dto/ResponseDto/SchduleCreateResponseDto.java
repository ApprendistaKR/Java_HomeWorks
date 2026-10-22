package com.schedules_2.schedule.Dto.ResponseDto;

import lombok.Getter;

@Getter
public class SchduleCreateResponseDto {
    //속성
    private final Long id;

    //생성자
    public SchduleCreateResponseDto(Long id) {
        this.id = id;
    }

    //기능
}
