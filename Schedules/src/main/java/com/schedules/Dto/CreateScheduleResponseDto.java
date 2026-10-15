package com.schedules.Dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CreateScheduleResponseDto {
    private Long id;
    private String title;
    private String content;
    private String username;
    private LocalDateTime date;

    public CreateScheduleResponseDto(
            Long id,
            String title,
            String content,
            String username,
            LocalDateTime date) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.username = username;
        this.date = date;


    }
}
