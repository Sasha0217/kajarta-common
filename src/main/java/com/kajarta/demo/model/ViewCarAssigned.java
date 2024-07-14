package com.kajarta.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "view_car_assigned", schema = "dbo")
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

    @Column(name = "assigned_status", nullable = false)
    private Integer assignedStatus;

    @Column(name = "create_time", nullable = false)
    private Date createTime;

    @Column(name = "update_time", nullable = false)
    private Date updateTime;

    @OneToMany(mappedBy = "viewCarAssigned")
    private Set<Notice> notices = new LinkedHashSet<>();

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