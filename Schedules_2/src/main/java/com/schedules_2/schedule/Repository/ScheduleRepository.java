package com.schedules_2.schedule.Repository;

import com.schedules_2.schedule.Entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
