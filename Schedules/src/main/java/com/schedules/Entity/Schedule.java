package com.schedules.Entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "schedules")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
public class Schedule {
    //속성
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(length = 50, nullable = false)
    private String title;
    @Column(length = 100, nullable = false)
    private String content;
    @Column(length = 10, nullable = false)
    private String username;
    @Column(length = 15, nullable = false)
    private String password;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime CraeteTime;

    @LastModifiedDate
    private LocalDateTime ModifyTime;



    //생성자
    //1. 클래스와 이름이 같다
    //2. 반환데이터 타입이 없다.
    //3. 여러개가 존재할 수 있다.
    public Schedule(String title, String content, String username, String password) {
        this.title = title;
        this.content = content;
        this.username = username;
        this.password = password;
    }
    //기능
    public void update(String title, String username) {
        this.title = title;
        this.username = username;
    }
}
