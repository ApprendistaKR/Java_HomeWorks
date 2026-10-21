package com.schedules_2.schedule.Entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "Schedules")
public class Schedule {
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

    @Column(updatable = false)
    @CreatedDate
    private LocalDateTime createDate;

//    @Column(updatable = false)
//    private LocalDateTime modifiedDate;

    //생성자
    public Schedule(String name, String title, String content) {
        this.name = name;
        this.title = title;
        this.content = content;
        this.createDate = createDate;
//        this.modifiedDate = modifiedDate;
    }

    //기능
    public Long getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getTitle() {
        return this.title;
    }
    public String getContent() {
        return this.content;
    }
    public LocalDateTime getCreateDate() {
        return this.createDate;
    }
//    public LocalDateTime getModifiedDate() {
//        return this.modifiedDate;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setTitle(String title) {
//        this.title = title;
//    }
//    public void setContent(String content) {
//        this.content = content;
//    }
}
