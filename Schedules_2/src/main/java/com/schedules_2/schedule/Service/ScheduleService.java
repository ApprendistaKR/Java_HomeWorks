package com.schedules_2.schedule.Service;

import com.schedules_2.schedule.Dto.RequestDto.ScheduleCreateRequestDto;
import com.schedules_2.schedule.Dto.ResponseDto.SchduleCreateResponseDto;
import com.schedules_2.schedule.Entity.Schedule;
import com.schedules_2.schedule.Repository.ScheduleRepository;
import org.springframework.transaction.annotation.Transactional;

@org.springframework.stereotype.Service
public class ScheduleService {
    //속성
    private final ScheduleRepository scheduleRepository;

    //생성자
    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    //기능
    @Transactional
    public SchduleCreateResponseDto createSchedule(ScheduleCreateRequestDto scheduleCreateRequestDto) {
        // 1. 데이터 준비
        String name = scheduleCreateRequestDto.getName();
        String title = scheduleCreateRequestDto.getTitle();
        String content = scheduleCreateRequestDto.getContent();

        // 2. 엔티티 준비
        Schedule newSchedule = new Schedule(name, title, content);

        // 3. 회원 저장 - 레포지토리 생성
        Schedule savedSchedule = this.scheduleRepository.save(newSchedule);

        // 4. 데이터 준비
        Long saveScheduleId = savedSchedule.getId();

        // 5. Dto 변환
        SchduleCreateResponseDto responseDto = new SchduleCreateResponseDto(saveScheduleId);

        //6. 변환
        return responseDto;


    }

}
