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
@Table(name = "view_car_assigned")
public class ViewCarAssigned {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "team_leader_id", nullable = false)
    private Integer teamLeaderId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "view_car_id", nullable = false)
    private ViewCar viewCar;

    @Column(name = "assigned_status", columnDefinition = "tinyint not null")
    private Short assignedStatus;

    @Column(name = "create_time", nullable = false)
    private Instant createTime;

    @Column(name = "update_time", nullable = false)
    private Instant updateTime;

    @OneToMany(mappedBy = "viewCarAssigned")
    private Set<Notice> notices = new LinkedHashSet<>();

}