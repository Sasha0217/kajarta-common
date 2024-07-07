package com.kajarta.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "carinfo")
public class Carinfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "brand", columnDefinition = "tinyint not null")
    private Short brand;

    @Column(name = "model_name", nullable = false, length = 20)
    private String modelName;

    @Column(name = "model", columnDefinition = "tinyint not null")
    private Short model;

    @Column(name = "door", columnDefinition = "tinyint not null")
    private Short door;

    @Column(name = "passenger", columnDefinition = "tinyint not null")
    private Short passenger;

    @Column(name = "rear_wheel", columnDefinition = "tinyint not null")
    private Short rearWheel;

    @Column(name = "gasoline", columnDefinition = "tinyint not null")
    private Short gasoline;

    @Column(name = "transmission", columnDefinition = "tinyint not null")
    private Short transmission;

    @Column(name = "cc", columnDefinition = "tinyint not null")
    private Short cc;

    @Column(name = "hp", nullable = false)
    private Integer hp;

    @Column(name = "torque", nullable = false)
    private Double torque;

    @Column(name = "create_time", nullable = false)
    private Instant createTime;

    @Column(name = "update_time", nullable = false)
    private Instant updateTime;

    @OneToMany(mappedBy = "carinfo")
    private Set<Car> cars = new LinkedHashSet<>();

    @OneToMany(mappedBy = "carinfo")
    private Set<Preference> preferences = new LinkedHashSet<>();

}