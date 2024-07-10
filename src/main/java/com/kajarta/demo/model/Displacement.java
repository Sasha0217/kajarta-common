package com.kajarta.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "displacement", schema = "dbo")
public class Displacement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "Displacement", nullable = false, length = 50)
    private String displacement;

    @Column(name = "code", nullable = false)
    private Integer code;

    @Nationalized
    @Column(name = "cc", nullable = false, length = 50)
    private String cc;

}