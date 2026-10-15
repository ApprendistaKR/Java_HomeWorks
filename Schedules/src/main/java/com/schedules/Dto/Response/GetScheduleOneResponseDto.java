package com.schedules.Dto.Response;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class GetScheduleOneResponseDto {
    private final Long id;
    private final String title;
    private final String content;
    private final String username;
    private final LocalDate date;

    public GetScheduleOneResponseDto(Long id, String title, String content, String username, LocalDate date) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.username = username;
        this.date = date;
    }
}

