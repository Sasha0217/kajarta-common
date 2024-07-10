package com.kajarta.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "gasoline", schema = "dbo")
public class Gasoline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "Gasoline", length = 20)
    private String gasoline;

    @Column(name = "code")
    private Integer code;

    @Nationalized
    @Column(name = "gaso", length = 20)
    private String gaso;

}