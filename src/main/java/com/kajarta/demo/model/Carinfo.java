package com.kajarta.demo.model;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "carinfo", schema = "dbo")
public class Carinfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "brand", nullable = false)
    private Integer brand;

    @Column(name = "model_name", nullable = false, length = 20)
    private String modelName;

    @Column(name = "model", nullable = false)
    private Integer model;

    @Column(name = "door", nullable = false)
    private Integer door;

    @Column(name = "passenger", nullable = false)
    private Integer passenger;

    @Column(name = "rear_wheel", nullable = false)
    private Integer rearWheel;

    @Column(name = "gasoline", nullable = false)
    private Integer gasoline;

    @Column(name = "transmission", nullable = false)
    private Integer transmission;

    @Column(name = "cc", nullable = false)
    private Integer cc;

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