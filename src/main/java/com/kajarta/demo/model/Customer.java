package com.kajarta.demo.model;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import org.hibernate.annotations.Nationalized;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "customer", schema = "dbo")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "account_type", nullable = false)
    private Integer accountType;

    @Column(name = "account", nullable = false, length = 20)
    private String account;

    @Column(name = "password", nullable = false, length = 20)
    private String password;

    @Nationalized
    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Column(name = "tel", length = 20)
    private String tel;

    @Column(name = "phone", nullable = false, length = 20)
    private String phone;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "create_time", nullable = false)
    private Date createTime;

    @Column(name = "update_time", nullable = false)
    private Date updateTime;

    @Column(name = "picture")
    private byte[] picture;

    @Column(name = "sex", nullable = false)
    private Character sex;

    @Column(name = "city", nullable = false)
    private Integer city;

    @Nationalized
    @Column(name = "remarks", length = 50)
    private String remarks;

    @Nationalized
    @Column(name = "address", nullable = false, length = 50)
    private String address;

    @Column(name = "id_number", nullable = false, length = 20)
    private String idNumber;

    @OneToMany(mappedBy = "customer")
    private Set<Car> cars = new LinkedHashSet<>();

    @OneToMany(mappedBy = "customer")
    private Set<Like> likes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "customer")
    private Set<Preference> preferences = new LinkedHashSet<>();

    @OneToMany(mappedBy = "customer")
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