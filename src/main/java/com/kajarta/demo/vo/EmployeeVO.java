package com.kajarta.demo.vo;

import com.kajarta.demo.page.Pages;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeVO extends Pages implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @Schema(description = "帳號分類狀態")
    private Integer accountType;

    @Schema(description = "帳號分類名稱")
    private String accountTypeName;

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

    @Schema(description = "直屬主管id")
    private Integer teamLeaderId;

    @Schema(description = "直屬主管")
    private String teamLeaderName;


    @Schema(description = "分店id")
    private Integer branch;

    @Schema(description = "分店所在城市")
    private String branchCity;

    @Schema(description = "分店地址")
    private String branchAddress;

    @Schema(description = "分店名稱")
    private String branchName;

    @Schema(description = "離職日")
    private LocalDate endDate;
}
