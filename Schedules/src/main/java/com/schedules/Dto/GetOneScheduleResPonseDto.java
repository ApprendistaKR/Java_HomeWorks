package com.schedules.Dto;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class GetOneScheduleResPonseDto {
    private final Long id;
    private final String title;
    private final String content;
    private final String username;
    private final LocalDate date;

    public GetOneScheduleResPonseDto(Long id, String title, String content, String username, LocalDate date) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.username = username;
        this.date = date;
    }
}

