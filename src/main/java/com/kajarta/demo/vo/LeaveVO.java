package com.kajarta.demo.vo;

import com.kajarta.demo.model.Employee;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LeaveVO {
    private Integer id;

    @Schema(description = "請假或給假")
    private Integer leaveStatus;

    @Schema(description = "開始時段")
    private Instant startTime;

    @Column(name = "end_time")
    private Instant endTime;

    @Column(name = "leave_type", nullable = false)
    private Integer leaveType;

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

    @Column(name = "permision_status")
    private Integer permisionStatus;

    @Column(name = "audit_time")
    private Date auditTime;

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
    private Date createTime;

    @Column(name = "update_time", nullable = false)
    private Date updateTime;

    @Column(name = "validity_period_start")
    private Date validityPeriodStart;

    @Column(name = "validity_period_end")
    private Date validityPeriodEnd;
}
