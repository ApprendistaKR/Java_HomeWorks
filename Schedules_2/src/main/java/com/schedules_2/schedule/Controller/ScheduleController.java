package com.schedules_2.schedule.Controller;

import com.schedules_2.schedule.Dto.RequestDto.ScheduleCreateRequestDto;
import com.schedules_2.schedule.Dto.ResponseDto.SchduleCreateResponseDto;
import com.schedules_2.schedule.Service.ScheduleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schedules")
public class ScheduleController {
    //속성
    private final ScheduleService service;


    //생성자
    //1. 클래스와 이름이 같다.
    //2. 반환 데이터 타입이 없다.
    //3. 여러개가 존재할 수 있다.
    public ScheduleController(ScheduleService service) {
        this.service = service;
    }

    //기능
    @PostMapping
    public ResponseEntity<SchduleCreateResponseDto> createMemberAPI(@RequestBody ScheduleCreateRequestDto scheduleCreateRequestDto) {
        // 1. 서비스 처리 -
        SchduleCreateResponseDto responseDto = this.service.createSchedule(scheduleCreateRequestDto);
        ResponseEntity<SchduleCreateResponseDto> response = new ResponseEntity<>(responseDto, HttpStatus.CREATED);

        //3. 반환
        return response;

    }
}
