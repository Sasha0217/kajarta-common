package com.kajarta.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "rearwheel", schema = "dbo")
public class Rearwheel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "RearWheel", length = 50)
    private String rearWheel;

    @Column(name = "code")
    private Integer code;

    @Nationalized
    @Column(name = "wheel", length = 50)
    private String wheel;

}