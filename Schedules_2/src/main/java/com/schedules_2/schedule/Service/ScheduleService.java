package com.schedules_2.schedule.Service;

import com.schedules_2.schedule.Dto.RequestDto.ScheduleCreateRequestDto;
import com.schedules_2.schedule.Dto.ResponseDto.SchduleCreateResponseDto;
import com.schedules_2.schedule.Entity.Schedule;
import com.schedules_2.schedule.Repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class ScheduleService {
    //속성
    private final ScheduleRepository scheduleRepository;

    //기능

    //생성 기능
    @Transactional
    public SchduleCreateResponseDto createSchedule(ScheduleCreateRequestDto scheduleCreateRequestDto) {
        Schedule schedule = new Schedule(
                scheduleCreateRequestDto.getName(),
                scheduleCreateRequestDto.getTitle(),
                scheduleCreateRequestDto.getContent()
        );
        Schedule savedSchedule = scheduleRepository.save(schedule);
        SchduleCreateResponseDto savedScheduleResponse = new SchduleCreateResponseDto(savedSchedule.getId());
        return savedScheduleResponse;
    }

    //조회 기능
    @Transactional
    public void getSchedule() {

        // 레포지토리 준비
        List<Schedule> listSchedule = this.scheduleRepository.findAll();

    }

}
