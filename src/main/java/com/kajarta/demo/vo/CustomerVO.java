package com.kajarta.demo.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerVO {

    private Integer id;

    @Schema(description = "帳號分類")
    private Integer accountType;

    @Schema(description = "帳號")
    private String account;

    @Schema(description = "密碼")
    private String password;

    @Schema(description = "姓名")
    private String name;

    @Schema(description = "市話")
    private String tel;

    @Schema(description = "手機")
    private String phone;

    @Schema(description = "email")
    private String email;

    @Schema(description = "創建時間")
    private String createTime;

    @Schema(description = "更新時間")
    private String updateTime;

    @Schema(description = "照片")
    private byte[] picture;

    @Schema(description = "性別")
    private Character sex;

    @Schema(description = "縣市")
    private Integer city;

    @Schema(description = "備註")
    private String remarks;

    @Schema(description = "地址")
    private String address;

    @Schema(description = "身分證")
    private String idNumber;


}
