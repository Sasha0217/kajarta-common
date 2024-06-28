package com.kajarta.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "car_adjust", schema = "dbo")
public class CarAdjust {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "team_leader_id", nullable = false)
    private EmployeeAccount teamLeader;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sales_id", nullable = false)
    private EmployeeAccount sales;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "car_id", nullable = false)
    private CarList car;

    @Column(name = "approval_status", columnDefinition = "tinyint not null")
    private Short approvalStatus;

    @Column(name = "approval_type", columnDefinition = "tinyint not null")
    private Short approvalType;

    @Column(name = "floating_amount", precision = 18)
    private BigDecimal floatingAmount;

    @Column(name = "create_time", nullable = false)
    private Instant createTime;

    @Column(name = "update_time", nullable = false)
    private Instant updateTime;

}