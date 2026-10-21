package com.schedules_2.schedule.Dto.RequestDto;

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
    public String getName() {
        return this.name;
    }
    public String getTitle() {
        return this.title;
    }
    public String getContent() {
        return this.content;
    }

}
