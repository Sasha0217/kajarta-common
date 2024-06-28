package com.kajarta.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "employee_account", schema = "dbo")
public class EmployeeAccount {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "account_type", columnDefinition = "tinyint not null")
    private Short accountType;

    @Column(name = "account", nullable = false, length = 20)
    private String account;

    @Column(name = "password", nullable = false, length = 20)
    private String password;

    @Nationalized
    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Column(name = "tel", length = 20)
    private String tel;

    @Column(name = "phone", nullable = false, length = 20)
    private String phone;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "create_time", nullable = false)
    private Instant createTime;

    @Column(name = "update_time", nullable = false)
    private Instant updateTime;

    @Column(name = "picture")
    private byte[] picture;

    @Column(name = "sex", nullable = false)
    private Character sex;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "sick_leave_hours")
    private Integer sickLeaveHours;

    @Column(name = "personal_leave_hours")
    private Integer personalLeaveHours;

    @Column(name = "annual_leave_hours")
    private Integer annualLeaveHours;

    @Column(name = "bereavement_leave_hours")
    private Integer bereavementLeaveHours;

    @Column(name = "marriage_leave_hours")
    private Integer marriageLeaveHours;

    @Column(name = "maternal_leave_hours")
    private Integer maternalLeaveHours;

    @Column(name = "paternity_leave_hours")
    private Integer paternityLeaveHours;

    @Column(name = "menstrual_leave_hours")
    private Integer menstrualLeaveHours;

    @Column(name = "official_leave_hours")
    private Integer officialLeaveHours;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "team_leader_id", nullable = false)
    private EmployeeAccount teamLeader;

    @Column(name = "branch", columnDefinition = "tinyint not null")
    private Short branch;

    @Column(name = "end_date")
    private LocalDate endDate;

}