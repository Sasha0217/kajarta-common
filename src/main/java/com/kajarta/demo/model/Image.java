package com.kajarta.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "image", schema = "dbo")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "image", nullable = false)
    private byte[] image;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "car_id", nullable = false)
    private Car car;

    @Column(name = "create_time", nullable = false)
    private Date createTime;

    @Column(name = "update_time", nullable = false)
    private Instant updateTime;

    @Column(name = "list_pic_id", columnDefinition = "tinyint not null")
    private Short listPicId;

    @Column(name = "is_main_pic", columnDefinition = "tinyint not null")
    private Short isMainPic;

    @Column(name = "is_list_pic", columnDefinition = "tinyint not null")
    private Short isListPic;

}