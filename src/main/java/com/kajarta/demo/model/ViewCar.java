package com.kajarta.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "view_car", schema = "dbo")
public class ViewCar {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "view_time_section", columnDefinition = "tinyint not null")
    private Short viewTimeSection;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "car_id", nullable = false)
    private CarList car;

    @Column(name = "sales_score", nullable = false)
    private Integer salesScore;

    @Column(name = "factory_score", nullable = false)
    private Integer factoryScore;

    @Column(name = "view_car_date", nullable = false)
    private Instant viewCarDate;

    @Column(name = "car_score", nullable = false)
    private Integer carScore;

    @Column(name = "deal", columnDefinition = "tinyint not null")
    private Short deal;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "member_id", nullable = false)
    private CustomerAccount member;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "view_car_assigned_id", nullable = false)
    private ViewCarAssigned viewCarAssigned;

    @Column(name = "create_time", nullable = false)
    private Instant createTime;

    @Column(name = "update_time", nullable = false)
    private Instant updateTime;

    @Column(name = "view_car_status", columnDefinition = "tinyint not null")
    private Short viewCarStatus;

    @OneToMany(mappedBy = "viewCar")
    private Set<Notice> notices = new LinkedHashSet<>();

    @OneToMany(mappedBy = "viewCar")
    private Set<ViewCarAssigned> viewCarAssigneds = new LinkedHashSet<>();

}