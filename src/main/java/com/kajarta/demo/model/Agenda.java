package com.kajarta.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;

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
    @JoinColumn(name = "member_id", nullable = false)
    private EmployeeAccount member;

    @Nationalized
    @Column(name = "business_purpose", nullable = false, length = 50)
    private String businessPurpose;

    @Column(name = "unavailable_time_str", nullable = false)
    private Instant unavailableTimeStr;

    @Column(name = "unavailable_time_end", nullable = false)
    private Instant unavailableTimeEnd;

    @Column(name = "unavailable_status", columnDefinition = "tinyint not null")
    private Short unavailableStatus;

    @Column(name = "create_time", nullable = false)
    private Instant createTime;

    @Column(name = "update_time", nullable = false)
    private Instant updateTime;

}