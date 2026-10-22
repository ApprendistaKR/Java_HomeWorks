package com.schedules_2.schedule;

import com.schedules_2.schedule.Entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
