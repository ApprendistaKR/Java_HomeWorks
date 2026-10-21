package com.schedules_2.schedule.Dto.ResponseDto;

public class SchduleCreateResponseDto {
    //속성
    private Long id;

    //생성자
    public SchduleCreateResponseDto(Long id) {
        this.id = id;
    }

    //기능
    public Long getId() {
        return this.id;
    }
}
