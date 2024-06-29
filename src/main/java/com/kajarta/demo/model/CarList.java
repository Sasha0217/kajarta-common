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
@Table(name = "car_list", schema = "dbo")
public class CarList {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "production_year", nullable = false)
    private Integer productionYear;

    @Column(name = "milage", nullable = false)
    private Integer milage;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "list_pic_id", nullable = false)
    private ImageList listPic;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "pic_id", nullable = false)
    private ImageList pic;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "member_id", nullable = false)
    private CustomerAccount member;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sales_id", nullable = false)
    private EmployeeAccount sales;

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
    @JoinColumn(name = "model_id", nullable = false)
    private CarinfoList model;

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
    private Set<ImageList> imageLists = new LinkedHashSet<>();

    @OneToMany(mappedBy = "car")
    private Set<LikeList> likeLists = new LinkedHashSet<>();

    @OneToMany(mappedBy = "car")
    private Set<Notice> notices = new LinkedHashSet<>();

    @OneToMany(mappedBy = "car")
    private Set<ViewCar> viewCars = new LinkedHashSet<>();

}