package com.kajarta.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "notice", schema = "dbo")
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "category", nullable = false)
    private Integer category;

    @Column(name = "create_time", nullable = false)
    private Date createTime;

    @Column(name = "update_time", nullable = false)
    private Date updateTime;

    @Column(name = "viewable_notification", columnDefinition = "tinyint not null")
    private Short viewableNotification;

    @Column(name = "read_status", nullable = false)
    private Integer readStatus;

    @Column(name = "receiver")
    private Integer receiver;

    @Column(name = "account_type", nullable = false)
    private Integer accountType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "view_car_id")
    private ViewCar viewCar;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "view_car_assigned_id")
    private ViewCarAssigned viewCarAssigned;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "preference_id")
    private Preference preference;

    @PrePersist
    public void onCreate() {
        if (createTime == null) {
            createTime = new Date();
        }
        if (updateTime == null) {
            updateTime = new Date();
        }
    }

    @PreUpdate
    public void onUpdate() {
        updateTime = new Date();
    }


}