package com.kajarta.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "suspension", schema = "dbo")
public class Suspension {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "Suspension", length = 50)
    private String suspension;

    @Column(name = "code")
    private Integer code;

    @Nationalized
    @Column(name = "type", length = 50)
    private String type;

}