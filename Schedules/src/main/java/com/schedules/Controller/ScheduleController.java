package com.schedules.Controller;

import com.schedules.Dto.*;
import com.schedules.Entity.Schedule;
import com.schedules.Service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleService;

    @PostMapping("/schedules")
    public ResponseEntity<CreateScheduleResponseDto> createSchedule(@RequestBody CreateScheduleRequestDto request) {
        CreateScheduleResponseDto result = scheduleService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @GetMapping("/schedules")
    public ResponseEntity<List<GetScheduleResponsetDto>> getAll() {
        List<GetScheduleResponsetDto> result = scheduleService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(result);

    }

    @GetMapping("/schedules/{schedulesId}")
    public ResponseEntity<GetScheduleResponsetDto> getOneSchedule(@PathVariable Long schedulesId) {
        GetScheduleResponsetDto result = scheduleService.getOne(schedulesId);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @PatchMapping("/schedule/{schedulesId}")
    public ResponseEntity<PatchScheduleResponseDto> update(
            @PathVariable Long schedulesId,
            @RequestBody PatchScheduleRequestDto request

    ) {
        PatchScheduleResponseDto result = scheduleService.patch(schedulesId, request);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @DeleteMapping("/schedule/{schdulesId}")
    public ResponseEntity<Void> delete(@PathVariable Long schdulesId) {
     scheduleService.delete(schdulesId);
     return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }




}
