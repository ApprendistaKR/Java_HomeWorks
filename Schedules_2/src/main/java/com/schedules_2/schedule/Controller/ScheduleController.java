package com.schedules_2.schedule.Controller;

import com.schedules_2.schedule.Dto.RequestDto.SchduleUpdateRequestDto;
import com.schedules_2.schedule.Dto.RequestDto.ScheduleCreateRequestDto;
import com.schedules_2.schedule.Dto.ResponseDto.SchduleCreateResponseDto;
import com.schedules_2.schedule.Dto.ResponseDto.ScheduleGetAllResponseDto;
import com.schedules_2.schedule.Dto.ResponseDto.ScheduleGetOneResponseDto;
import com.schedules_2.schedule.Dto.ResponseDto.ScheduleUpdatResponseDto;
import com.schedules_2.schedule.Service.ScheduleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseEntity<SchduleCreateResponseDto> create(@RequestBody ScheduleCreateRequestDto scheduleCreateRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createSchedule(scheduleCreateRequestDto));
    }
    @GetMapping
    public ResponseEntity<List<ScheduleGetAllResponseDto>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

    @GetMapping("/{scheduleId}")
    public ResponseEntity<ScheduleGetOneResponseDto> getOne(
            @PathVariable Long scheduleId
    ) {
        return ResponseEntity.status(HttpStatus.OK).body(service.findOne(scheduleId));
    }

    @PutMapping("/{scheduleId}")
    public ResponseEntity<ScheduleUpdatResponseDto> update(
            @PathVariable Long scheduleId,
            @RequestBody SchduleUpdateRequestDto request
    ) {
        return ResponseEntity.status(HttpStatus.OK).body(service.update(scheduleId, request));
    }

    @DeleteMapping("/{scheduleId}")
    public void delete(
            @PathVariable Long scheduleId
    ) {
        service.delete(scheduleId);
    }


}
