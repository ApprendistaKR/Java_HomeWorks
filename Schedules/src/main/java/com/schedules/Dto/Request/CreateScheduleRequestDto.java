package com.schedules.Dto.Request;

import com.schedules.Entity.Schedule;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreateScheduleRequestDto {

    //속성
    private String title;
    private String content;
    private String username;
    private String password;

    //생성자
    //1. 클래스와 이름이 같다.
    //2. 반환 데이터 타입이 없다.
    //3. 여러개가 존재할 수 있다.


    //기능
    public Schedule toEntity() {
        return new Schedule(title, content, username, password);
    }

}
