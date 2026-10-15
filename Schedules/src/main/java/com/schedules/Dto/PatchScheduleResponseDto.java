package com.schedules.Dto;

import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
public class PatchScheduleResponseDto {
    private final Long id;
    private final String title;
    private final String content;
    private final String username;
    private final LocalDateTime date;

    public PatchScheduleResponseDto(Long id, String title, String content, String username, LocalDateTime date) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.username = username;
        this.date = date;
    }
}
