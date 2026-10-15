package com.schedules.Entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@Entity
@Table(name = "schedules")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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
    private LocalDate date;



    //생성자
    //1. 클래스와 이름이 같다
    //2. 반환데이터 타입이 없다.
    //3. 여러개가 존재할 수 있다.
    public Schedule(String title, String content, String username, String password, LocalDate date) {
        this.title = title;
        this.content = content;
        this.username = username;
        this.password = password;
        this.date = date;
    }
    //기능
    public void update(String title, String username) {
        this.title = title;
        this.username = username;
    }
}
