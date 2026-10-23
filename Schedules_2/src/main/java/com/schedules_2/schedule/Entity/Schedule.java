package com.schedules_2.schedule.Entity;

import com.schedules_2.User.Entity.User;
import com.schedules_2.common.BassEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "Schedules")
public class Schedule extends BassEntity {
    //속성
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false, length = 30)
    private String title;

    @Column(nullable = false, length = 100)
    private String content;




    //생성자
    public Schedule(User user, String title, String content) {
        this.user = user;
        this.title = title;
        this.content = content;

    }

    public void updateNameTitleContent(User user, String title, String content) {
        this.user = user;
        this.title = title;
        this.content = content;

    }

    //기능

}
