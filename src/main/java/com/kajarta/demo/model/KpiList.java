package com.kajarta.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "kpi_list", schema = "dbo")
public class KpiList {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "season_str_day", nullable = false)
    private Instant seasonStrDay;

    @Column(name = "team_leader_rating")
    private Integer teamLeaderRating;

    @Column(name = "total_score", precision = 5, scale = 1)
    private BigDecimal totalScore;

    @Column(name = "sales_score")
    private Integer salesScore;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "member_id", nullable = false)
    private EmployeeAccount member;

    @Column(name = "create_time", nullable = false)
    private Instant createTime;

    @Column(name = "update_time", nullable = false)
    private Instant updateTime;

}