package com.schedules.Service;

import com.schedules.Dto.*;
import com.schedules.Entity.Schedule;
import com.schedules.Repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    //일정 생성
    @Transactional
    public CreateScheduleResponseDto save(CreateScheduleRequestDto request) {
        Schedule schedule = new Schedule(
                request.getTitle(),
                request.getContent(),
                request.getUsername(),
                request.getPassword()
        );
        Schedule savedSchedule = scheduleRepository.save(schedule);
        return new CreateScheduleResponseDto(
                savedSchedule.getId(),
                savedSchedule.getTitle(),
                savedSchedule.getContent(),
                savedSchedule.getUsername(),
                savedSchedule.getCraeteTime()
        );
    }
//    일정 전체 조회
    @Transactional(readOnly = true)
    public List<GetScheduleResponsetDto> getAll() {
        List<Schedule> schedules = scheduleRepository.findAll();
        List<GetScheduleResponsetDto> dtos = new ArrayList<>();

        for (Schedule schedule : schedules) {
            GetScheduleResponsetDto dto = new GetScheduleResponsetDto(
                    schedule.getId(),
                    schedule.getTitle(),
                    schedule.getContent(),
                    schedule.getUsername(),
                    schedule.getCraeteTime()
            );
            dtos.add(dto);
        }
        return dtos;
    }
//    일정 단건 조회
    @Transactional(readOnly = true)
    public GetScheduleResponsetDto getOne(Long schdulesid) {
        Schedule schedule = scheduleRepository.findById(schdulesid).orElseThrow(
                () -> new IllegalStateException("존재하지 않는 일정입니다.")
        );
        return new GetScheduleResponsetDto(
                schedule.getId(),
                schedule.getTitle(),
                schedule.getContent(),
                schedule.getUsername(),
                schedule.getCraeteTime()
        );
    }

    // 일정 수정
    @Transactional
    public PatchScheduleResponseDto patch(Long schdulesid, PatchScheduleRequestDto request) {
        Schedule schedule = scheduleRepository.findById(schdulesid).orElseThrow(
                () -> new IllegalStateException("존재하지 않는 일정입니다.")
        );
        schedule.update(
                request.getTitle(),
                request.getUsername()
        );
        return new PatchScheduleResponseDto(
                schedule.getId(),
                schedule.getTitle(),
                schedule.getContent(),
                schedule.getUsername(),
                schedule.getModifyTime()
        );
    }
    //일정 삭제
    @Transactional
    public void delete(Long schdulesid) {
        boolean existence = scheduleRepository.existsById(schdulesid);
        if (!existence) {
            throw new IllegalStateException("존재하지 않는 유저입니다.");
        }
        scheduleRepository.deleteById(schdulesid);
    }

}
