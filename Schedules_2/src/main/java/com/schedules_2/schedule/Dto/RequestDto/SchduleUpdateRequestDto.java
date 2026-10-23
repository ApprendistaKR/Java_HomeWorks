package com.schedules_2.schedule.Dto.RequestDto;

import com.schedules_2.User.Entity.User;
import lombok.Getter;

@Getter
public class SchduleUpdateRequestDto {
    private Long userId;
    private String title;
    private String content;

    public SchduleUpdateRequestDto(Long userId, String title, String content) {
        this.userId = userId;
        this.title = title;
        this.content = content;
    }
}
