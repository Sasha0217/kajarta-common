package com.kajarta.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "agenda", schema = "dbo")
public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @Nationalized
    @Column(name = "business_purpose", nullable = false, length = 50)
    private String businessPurpose;

    @Column(name = "unavailable_time_str", nullable = false)
    private Date unavailableTimeStr;

    @Column(name = "unavailable_time_end", nullable = false)
    private Date unavailableTimeEnd;

    @Column(name = "unavailable_status", nullable = false)
    private Integer unavailableStatus;

    @Column(name = "create_time", nullable = false)
    private Date createTime;

    @Column(name = "update_time", nullable = false)
    private Date updateTime;

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
