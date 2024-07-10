package com.kajarta.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "transmission", schema = "dbo")
public class Transmission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "Transmission", length = 20)
    private String transmission;

    @Column(name = "code")
    private Integer code;

    @Nationalized
    @Column(name = "trans", length = 20)
    private String trans;

}