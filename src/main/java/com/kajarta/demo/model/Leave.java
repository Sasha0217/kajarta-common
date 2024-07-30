package com.kajarta.demo.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;
import java.util.Date;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "leave", schema = "dbo")
public class Leave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Schema(description = "請假類型:0-請假 1-給假")
    @Column(name = "leave_status", nullable = false)
    private Integer leaveStatus;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "end_time")
    private Date endTime;

    @Column(name = "leave_type", nullable = false)
    private Integer leaveType;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @Column(name = "deputy_id")
    private Integer deputyId;

    @Column(name = "team_leader_id")
    private Integer teamLeaderId;

    @Nationalized
    @Column(name = "permision_remarks", length = 50)
    private String permisionRemarks;

    @Schema(description = "核可狀態:1-簽核中 2-同意 3-拒絕")
    @Column(name = "permision_status")
    private Integer permisionStatus;

    @Column(name = "audit_time")
    private Date auditTime;

    @Nationalized
    @Column(name = "reason", length = 50)
    private String reason;

    @Schema(description = "實際請假/給假 時數")
    @Column(name = "actual_leave_hours")
    private Integer actualLeaveHours;

    @Column(name = "image")
    private byte[] image;

    @Schema(description = "用不到")
    @Column(name = "special_leave_hours")
    private Integer specialLeaveHours;

    @Column(name = "create_time", nullable = false)
    private Date createTime;

    @Column(name = "update_time", nullable = false)
    private Date updateTime;

    @Schema(description = "給假的開始時間")
    @Column(name = "validity_period_start")
    private Date validityPeriodStart;

    @Schema(description = "當作用來記錄該假別的最後使用期限，可以獲取同假別的最新一筆紀錄")
    @Column(name = "validity_period_end")
    private Date validityPeriodEnd;

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
