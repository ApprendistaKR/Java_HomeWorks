package com.schedules_2.schedule;

import com.schedules_2.User.Entity.User;
import com.schedules_2.User.UserRepository;
import com.schedules_2.schedule.Dto.RequestDto.SchduleUpdateRequestDto;
import com.schedules_2.schedule.Dto.RequestDto.ScheduleCreateRequestDto;
import com.schedules_2.schedule.Dto.ResponseDto.SchduleCreateResponseDto;
import com.schedules_2.schedule.Dto.ResponseDto.ScheduleGetAllResponseDto;
import com.schedules_2.schedule.Dto.ResponseDto.ScheduleGetOneResponseDto;
import com.schedules_2.schedule.Dto.ResponseDto.ScheduleUpdatResponseDto;
import com.schedules_2.schedule.Entity.Schedule;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class ScheduleService {
    //속성
    private final ScheduleRepository scheduleRepository;
    private final UserRepository userRepository;

    //기능

    //생성 기능
    @Transactional
    public SchduleCreateResponseDto createSchedule(ScheduleCreateRequestDto scheduleCreateRequestDto) {

        User user = userRepository.findById(scheduleCreateRequestDto.getUserId())
                .orElseThrow(() -> new IllegalArgumentException(
                        "존재하지 않는 유저입니다. ID: " + scheduleCreateRequestDto.getUserId()));

        Schedule schedule = new Schedule(
               user,
                scheduleCreateRequestDto.getTitle(),
                scheduleCreateRequestDto.getContent()
        );
        Schedule savedSchedule = scheduleRepository.save(schedule);
        SchduleCreateResponseDto savedScheduleResponse = new SchduleCreateResponseDto(savedSchedule.getId());
        return savedScheduleResponse;
    }

    //전체 조회 기능
    @Transactional(readOnly = true)
    public List<ScheduleGetAllResponseDto> findAll() {
        List<Schedule> schedules = scheduleRepository.findAll();
        return schedules.stream().map(schedule -> new ScheduleGetAllResponseDto(
                schedule.getId(),
                schedule.getUser().getName(),
                schedule.getTitle(),
                schedule.getContent(),
                schedule.getCreateAt(),
                schedule.getModifiedAt()
        )).toList();
    }


    //단건 조회 기능
    @Transactional(readOnly = true)
    public ScheduleGetOneResponseDto findOne(Long scheduleId) {
        Schedule schedule = scheduleRepository.findById(scheduleId).orElseThrow(
                () -> new IllegalStateException("존재하지 않는 일정입니다.")
        );
        return new ScheduleGetOneResponseDto(
                schedule.getId(),
                schedule.getUser().getName(),
                schedule.getTitle(),
                schedule.getContent(),
                schedule.getCreateAt(),
                schedule.getModifiedAt()
        );
    }
    //일정 수정
    @Transactional
    public ScheduleUpdatResponseDto update(Long scheduleId, SchduleUpdateRequestDto request) {
        Schedule schedule = scheduleRepository.findById(scheduleId).orElseThrow(
                () -> new IllegalStateException("존재하지 않는 일정입니다.")
        );
        User user = userRepository.findById(request.getUserId()).orElseThrow(
                () -> new IllegalArgumentException("존재하지 않는 유저입니다.")
        );
        schedule.updateNameTitleContent(
                user,
                request.getTitle(),
                request.getContent()
        );
        return new ScheduleUpdatResponseDto(
                schedule.getId(),
                schedule.getUser().getName(),
                schedule.getTitle(),
                schedule.getContent(),
                schedule.getCreateAt(),
                schedule.getModifiedAt()
        );
    }

    //일정 삭제
    @Transactional
    public void delete(Long scheduleId) {
        Schedule schedule = scheduleRepository.findById(scheduleId).orElseThrow(
                () -> new IllegalStateException("존재하지 않는 일정입니다.")
        );
        scheduleRepository.deleteById(scheduleId);
    }
}
