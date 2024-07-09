package com.kajarta.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "door", schema = "dbo")
public class Door {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "Door", nullable = false, length = 50)
    private String door;

    @Column(name = "code", nullable = false)
    private Integer code;

    @Nationalized
    @Column(name = "cardoor", nullable = false, length = 50)
    private String cardoor;

}