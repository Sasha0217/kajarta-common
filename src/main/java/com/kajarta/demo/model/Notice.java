package com.kajarta.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "notice", schema = "dbo")
public class Notice {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "category", columnDefinition = "tinyint not null")
    private Short category;

    @Column(name = "create_time", nullable = false)
    private Instant createTime;

    @Column(name = "update_time", nullable = false)
    private Instant updateTime;

    @Column(name = "viewable_notification", columnDefinition = "tinyint not null")
    private Short viewableNotification;

    @Column(name = "read_status", columnDefinition = "tinyint not null")
    private Short readStatus;

    @Column(name = "receiver")
    private Integer receiver;

    @Column(name = "account_type", columnDefinition = "tinyint not null")
    private Short accountType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "view_car_id")
    private ViewCar viewCar;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "view_car_assigned_id")
    private ViewCarAssigned viewCarAssigned;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "car_id")
    private CarList car;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "preference_list_id")
    private PreferenceList preferenceList;

}