package com.kajarta.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "leave")
public class Leave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "leave_status", columnDefinition = "tinyint not null")
    private Short leaveStatus;

    @Column(name = "start_time")
    private Instant startTime;

    @Column(name = "end_time")
    private Instant endTime;

    @Column(name = "leave_type", columnDefinition = "tinyint not null")
    private Short leaveType;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @Column(name = "deputy_id")
    private Integer deputyId;

    @Column(name = "team_leader_id", nullable = false)
    private Integer teamLeaderId;

    @Nationalized
    @Column(name = "permision_remarks", length = 50)
    private String permisionRemarks;

    @Column(name = "permision_status", columnDefinition = "tinyint")
    private Short permisionStatus;

    @Column(name = "audit_time")
    private Instant auditTime;

    @Nationalized
    @Column(name = "reason", nullable = false, length = 50)
    private String reason;

    @Column(name = "actual_leave_hours")
    private Integer actualLeaveHours;

    @Column(name = "image")
    private byte[] image;

    @Column(name = "special_leave_hours")
    private Integer specialLeaveHours;

    @Column(name = "create_time", nullable = false)
    private Instant createTime;

    @Column(name = "update_time", nullable = false)
    private Instant updateTime;

    @Column(name = "validity_period_start")
    private Instant validityPeriodStart;

    @Column(name = "validity_period_end")
    private Instant validityPeriodEnd;

}