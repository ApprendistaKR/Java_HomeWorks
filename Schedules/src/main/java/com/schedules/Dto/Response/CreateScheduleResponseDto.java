package com.schedules.Dto.Response;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CreateScheduleResponseDto {
    private final Long id;
    private final String title;
    private final String content;
    private final String username;
    private final LocalDateTime createTime;
    private final LocalDateTime modifiedTime;

    public CreateScheduleResponseDto(
            Long id,
            String title,
            String content,
            String username,
            LocalDateTime createTime, LocalDateTime modifiedTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.username = username;
        this.createTime = createTime;
        this.modifiedTime = modifiedTime;


    }
}
