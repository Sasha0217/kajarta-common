package com.kajarta.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "view_car", schema = "dbo")
public class ViewCar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "view_time_section", nullable = false)
    private Integer viewTimeSection;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "car_id", nullable = false)
    private Car car;

    @Column(name = "sales_score", nullable = false)
    private Integer salesScore;

    @Column(name = "factory_score", nullable = false)
    private Integer factoryScore;

    @Column(name = "view_car_date", nullable = false)
    private Instant viewCarDate;

    @Column(name = "car_score", nullable = false)
    private Integer carScore;

    @Column(name = "deal", nullable = false)
    private Integer deal;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Column(name = "create_time", nullable = false)
    private Date createTime;

    @Column(name = "update_time", nullable = false)
    private Date updateTime;

    @Column(name = "view_car_status", nullable = false)
    private Integer viewCarStatus;

    @OneToMany(mappedBy = "viewCar")
    private Set<Notice> notices = new LinkedHashSet<>();

    @OneToMany(mappedBy = "viewCar")
    private Set<ViewCarAssigned> viewCarAssigneds = new LinkedHashSet<>();

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