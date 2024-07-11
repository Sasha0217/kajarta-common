package com.kajarta.demo.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import org.hibernate.annotations.Nationalized;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "car", schema = "dbo")
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
    @JsonIgnore
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employee_id", nullable = false)
    @JsonIgnore
    private Employee employee;

    @Column(name = "negotiable")
    private Integer negotiable;

    @Column(name = "condition_score", nullable = false)
    private Integer conditionScore;

    @Column(name = "branch", nullable = false)
    private Integer branch;

    @Column(name = "state", nullable = false)
    private Integer state;

    @Column(name = "price", nullable = false, precision = 18)
    private BigDecimal price;

    @Column(name = "launch_date", nullable = false)
    private Date launchDate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "carinfo_id", nullable = false)
    @JsonIgnore
    private Carinfo carinfo;

    @Nationalized
    @Column(name = "color", nullable = false, length = 20)
    private String color;

    @Column(name = "remark", nullable = false)
    private Integer remark;

    @Column(name = "create_time", nullable = false)
    private Date createTime;

    @Column(name = "update_time", nullable = false)
    private Date updateTime;

    @OneToMany(mappedBy = "car")
    @JsonIgnore
    private Set<CarAdjust> carAdjusts = new LinkedHashSet<>();

    @OneToMany(mappedBy = "car")
    @JsonIgnore
    private Set<Image> images = new LinkedHashSet<>();

    @OneToMany(mappedBy = "car")
    @JsonIgnore
    private Set<Like> likes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "car")
    @JsonIgnore
    private Set<Notice> notices = new LinkedHashSet<>();

    @OneToMany(mappedBy = "car")
    @JsonIgnore
    private Set<ViewCar> viewCars = new LinkedHashSet<>();

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