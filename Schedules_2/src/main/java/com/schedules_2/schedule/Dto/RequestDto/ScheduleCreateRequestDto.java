package com.schedules_2.schedule.Dto.RequestDto;


import com.schedules_2.User.Entity.User;
import lombok.Getter;


@Getter
public class ScheduleCreateRequestDto {
    //속성
    private Long userId;
    private String title;
    private String content;

    //생성자
    public ScheduleCreateRequestDto(Long userId, String title, String content) {
        this.userId = userId;
        this.title = title;
        this.content = content;
    }

    //기능

}
