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
@Table(name = "preference")
public class Preference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "select_name", nullable = false, length = 20)
    private String selectName;

    @Column(name = "production_year")
    private Integer productionYear;

    @Column(name = "price", precision = 18)
    private BigDecimal price;

    @Column(name = "milage")
    private Integer milage;

    @Column(name = "score")
    private Integer score;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "carinfo_id")
    private Carinfo carinfo;

    @Column(name = "brand", columnDefinition = "tinyint")
    private Short brand;

    @Column(name = "suspension", columnDefinition = "tinyint")
    private Short suspension;

    @Column(name = "door", columnDefinition = "tinyint")
    private Short door;

    @Column(name = "passenger", columnDefinition = "tinyint")
    private Short passenger;

    @Column(name = "rear_wheel", columnDefinition = "tinyint")
    private Short rearWheel;

    @Column(name = "gasoline", columnDefinition = "tinyint")
    private Short gasoline;

    @Column(name = "transmission", columnDefinition = "tinyint")
    private Short transmission;

    @Column(name = "cc", columnDefinition = "tinyint")
    private Short cc;

    @Column(name = "hp")
    private Integer hp;

    @Column(name = "torque")
    private Double torque;

    @Column(name = "create_time", nullable = false)
    private Instant createTime;

    @Column(name = "update_time", nullable = false)
    private Instant updateTime;

    @Column(name = "preferences_lists", columnDefinition = "tinyint not null")
    private Short preferencesLists;

    @OneToMany(mappedBy = "preference")
    private Set<Notice> notices = new LinkedHashSet<>();

}