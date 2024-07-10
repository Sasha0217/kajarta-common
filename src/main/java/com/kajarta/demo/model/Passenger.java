package com.kajarta.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "passenger", schema = "dbo")
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "Passenger", length = 20)
    private String passenger;

    @Column(name = "code")
    private Integer code;

    @Nationalized
    @Column(name = "seat", length = 20)
    private String seat;

}