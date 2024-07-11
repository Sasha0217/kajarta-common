package com.kajarta.demo.vo;

import com.kajarta.demo.model.*;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeVO {

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
    private Date createTime;

    @Schema(description = "更新時間")
    private Date updateTime;

    @Schema(description = "照片")
    private byte[] picture;

    @Schema(description = "性別")
    private Character sex;

    @Schema(description = "入職日")
    private LocalDate startDate;

    @Schema(description = "病假剩餘時數")
    private Integer sickLeaveHours;

    @Schema(description = "事假剩餘時數")
    private Integer personalLeaveHours;

    @Schema(description = "特休剩餘時數")
    private Integer annualLeaveHours;

    @Schema(description = "喪假剩餘時數")
    private Integer bereavementLeaveHours;

    @Schema(description = "婚假剩餘時數")
    private Integer marriageLeaveHours;

    @Schema(description = "生理假剩餘時數")
    private Integer menstrualLeaveHours;

    @Schema(description = "公假剩餘時數")
    private Integer officialLeaveHours;

    @Schema(description = "直屬主管")
    private EmployeeVO teamLeader;

    @Schema(description = "分店")
    private Integer branch;

    @Schema(description = "離職日")
    private LocalDate endDate;
}