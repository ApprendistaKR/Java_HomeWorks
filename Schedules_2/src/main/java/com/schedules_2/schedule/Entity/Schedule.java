package com.schedules_2.schedule.Entity;

import com.schedules_2.common.BassEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "Schedules")
public class Schedule extends BassEntity {
    //속성
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false, length = 30)
    private String title;

    @Column(nullable = false, length = 100)
    private String content;




    //생성자
    public Schedule(String name, String title, String content) {
        this.name = name;
        this.title = title;
        this.content = content;

    }

    public void updateNameTitleContent(String name, String title, String content) {
        this.name = name;
        this.title = title;
        this.content = content;

    }

    //기능

}
