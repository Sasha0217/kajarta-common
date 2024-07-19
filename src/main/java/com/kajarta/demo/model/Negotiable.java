package com.kajarta.demo.model;

import org.hibernate.annotations.Nationalized;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "negotiable", schema = "dbo")
public class Negotiable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "negotiable", length = 50)
    private String negotiable;

    @Column(name = "code")
    private Integer code;

    @Nationalized
    @Column(name = "percent", length = 50)
    private String percent;
}
