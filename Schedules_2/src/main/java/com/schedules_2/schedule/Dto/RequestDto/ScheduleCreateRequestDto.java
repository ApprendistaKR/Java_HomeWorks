package com.schedules_2.schedule.Dto.RequestDto;


import lombok.Getter;


@Getter
public class ScheduleCreateRequestDto {
    //속성
    private String name;
    private String title;
    private String content;

    //생성자
    public ScheduleCreateRequestDto(String name, String title, String content) {
        this.name = name;
        this.title = title;
        this.content = content;
    }

    //기능

}
