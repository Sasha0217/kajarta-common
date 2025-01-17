package com.kajarta.demo.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;
import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "employee", schema = "dbo")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "account_type", nullable = false)
    private Integer accountType;

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
    private Date createTime;

    @Column(name = "update_time", nullable = false)
    private Date updateTime;

    @Column(name = "picture")
    private byte[] picture;

    @Column(name = "sex", nullable = false)
    private Character sex;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Schema(description = "病假剩餘時數")
    @Column(name = "sick_leave_hours")
    private Integer sickLeaveHours;

    @Schema(description = "事假剩餘時數")
    @Column(name = "personal_leave_hours")
    private Integer personalLeaveHours;

    @Schema(description = "特休剩餘時數")
    @Column(name = "annual_leave_hours")
    private Integer annualLeaveHours;

    @Schema(description = "喪假剩餘時數")
    @Column(name = "bereavement_leave_hours")
    private Integer bereavementLeaveHours;

    @Schema(description = "婚假剩餘時數")
    @Column(name = "marriage_leave_hours")
    private Integer marriageLeaveHours;

    @Schema(description = "生理假剩餘時數")
    @Column(name = "menstrual_leave_hours")
    private Integer menstrualLeaveHours;

    @Schema(description = "公假剩餘時數")
    @Column(name = "official_leave_hours")
    private Integer officialLeaveHours;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "team_leader_id")
    private Employee teamLeader;

    @Column(name = "branch", nullable = false)
    private Integer branch;

    @Column(name = "end_date")
    private LocalDate endDate;

    @OneToMany(mappedBy = "employee")
    private Set<Agenda> agenda = new LinkedHashSet<>();

    @OneToMany(mappedBy = "employee")
    private Set<Car> cars = new LinkedHashSet<>();

    @OneToMany(mappedBy = "employee")
    private Set<CarAdjust> carAdjusts = new LinkedHashSet<>();

    @OneToMany(mappedBy = "teamLeader")
    private Set<Employee> employees = new LinkedHashSet<>();

    @OneToMany(mappedBy = "employee")
    private Set<Kpi> kpis = new LinkedHashSet<>();

    @OneToMany(mappedBy = "employee")
    private Set<Leave> leaves = new LinkedHashSet<>();

    @OneToMany(mappedBy = "employee")
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
