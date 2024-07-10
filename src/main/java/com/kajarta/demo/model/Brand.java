package com.kajarta.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "brand", schema = "dbo")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "Brand", length = 50)
    private String brand;

    @Column(name = "code")
    private Integer code;

    @Nationalized
    @Column(name = "trademark", length = 50)
    private String trademark;

}