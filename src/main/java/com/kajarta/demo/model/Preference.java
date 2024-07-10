package com.kajarta.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "preference", schema = "dbo")
public class Preference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "select_name", nullable = false, length = 20)
    private String selectName;

    @Column(name = "production_year")
    private Integer productionYear;

    @Column(name = "price", precision = 18)
    private BigDecimal price;

    @Column(name = "milage")
    private Integer milage;

    @Column(name = "score")
    private Integer score;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "carinfo_id")
    private Carinfo carinfo;

    @Column(name = "brand", columnDefinition = "tinyint")
    private int brand;

    @Column(name = "suspension")
    private Integer suspension;

    @Column(name = "door")
    private Integer door;

    @Column(name = "passenger")
    private Integer passenger;

    @Column(name = "rear_wheel")
    private Integer rearWheel;

    @Column(name = "gasoline")
    private Integer gasoline;

    @Column(name = "transmission")
    private Integer transmission;

    @Column(name = "cc")
    private Integer cc;

    @Column(name = "hp")
    private Integer hp;

    @Column(name = "torque")
    private Double torque;

    @Column(name = "create_time", nullable = false)
    private Date createTime;

    @Column(name = "update_time", nullable = false)
    private Date updateTime;

    @Column(name = "preferences_lists", nullable = false)
    private Integer preferencesLists;

    @OneToMany(mappedBy = "preference")
    private Set<Notice> notices = new LinkedHashSet<>();

    @PrePersist
    public void onCreate() {
        if (createTime == null) {
            createTime = new Date();
        }
        if (updateTime == null) {
            updateTime = new Date();
        }
    }

    @PreUpdate
    public void onUpdate() {
        updateTime = new Date();
    }


}