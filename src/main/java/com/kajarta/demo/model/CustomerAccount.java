package com.kajarta.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "customer_account", schema = "dbo")
public class CustomerAccount {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "account_type", columnDefinition = "tinyint not null")
    private Short accountType;

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
    private Instant createTime;

    @Column(name = "update_time", nullable = false)
    private Instant updateTime;

    @Column(name = "picture")
    private byte[] picture;

    @Column(name = "sex", nullable = false)
    private Character sex;

    @Column(name = "city", columnDefinition = "tinyint not null")
    private Short city;

    @Nationalized
    @Column(name = "remarks", length = 50)
    private String remarks;

    @Nationalized
    @Column(name = "address", nullable = false, length = 50)
    private String address;

    @Column(name = "id_number", nullable = false, length = 20)
    private String idNumber;

    @OneToMany(mappedBy = "member")
    private Set<CarList> carLists = new LinkedHashSet<>();

    @OneToMany(mappedBy = "member")
    private Set<LikeList> likeLists = new LinkedHashSet<>();

    @OneToMany(mappedBy = "member")
    private Set<ViewCar> viewCars = new LinkedHashSet<>();

}