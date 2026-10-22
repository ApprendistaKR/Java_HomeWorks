package com.schedules_2.schedule.Dto.RequestDto;

import lombok.Getter;

@Getter
public class SchduleUpdateRequestDto {
    private String name;
    private String title;
    private String content;

    public SchduleUpdateRequestDto(String name, String title, String content) {
        this.name = name;
        this.title = title;
        this.content = content;
    }
}
