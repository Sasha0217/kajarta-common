package com.kajarta.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "production_year", nullable = false)
    private Integer productionYear;

    @Column(name = "milage", nullable = false)
    private Integer milage;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @Column(name = "negotiable", columnDefinition = "tinyint")
    private Short negotiable;

    @Column(name = "condition_score", nullable = false)
    private Integer conditionScore;

    @Column(name = "branch", columnDefinition = "tinyint not null")
    private Short branch;

    @Column(name = "state", columnDefinition = "tinyint not null")
    private Short state;

    @Column(name = "price", nullable = false, precision = 18)
    private BigDecimal price;

    @Column(name = "launch_date", nullable = false)
    private Instant launchDate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "carinfo_id", nullable = false)
    private Carinfo carinfo;

    @Nationalized
    @Column(name = "color", nullable = false, length = 20)
    private String color;

    @Column(name = "remark", columnDefinition = "tinyint not null")
    private Short remark;

    @Column(name = "create_time", nullable = false)
    private Instant createTime;

    @Column(name = "update_time", nullable = false)
    private Instant updateTime;

    @OneToMany(mappedBy = "car")
    private Set<CarAdjust> carAdjusts = new LinkedHashSet<>();

    @OneToMany(mappedBy = "car")
    private Set<Image> images = new LinkedHashSet<>();

    @OneToMany(mappedBy = "car")
    private Set<Like> likes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "car")
    private Set<Notice> notices = new LinkedHashSet<>();

    @OneToMany(mappedBy = "car")
    private Set<ViewCar> viewCars = new LinkedHashSet<>();

}