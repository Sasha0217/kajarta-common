package com.kajarta.demo.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarAdjustVO {

    private Integer id;

    @Schema(description = "主管")
    private String teamLeaderName;

    @Schema(description = "建立修改員工")
    private String employeeName;

    @Schema(description = "修改車輛ID")
    private Integer carId;

    @Schema(description = "簽核狀態(編號)")
    private Integer approvalStatus;

    @Schema(description = "簽核種類(編號)")
    private Integer approvalType;

    @Schema(description = "簽核狀態")
    private String approvalStatusName;

    @Schema(description = "簽核種類")
    private String approvalTypeName;

    @Schema(description = "最終異動金額")
    private BigDecimal floatingAmount;

    @Schema(description = "創建時間String")
    private String createTimeString;

    @Schema(description = "更新時間String")
    private String updateTimeString;

    // 0723新增

    @Schema(description = "建立修改員工ID")
    private Integer employeeId;

    @Schema(description = "主管ID")
    private Integer teamLeaderId;

    @Schema(description = "修改車輛價格")
    private BigDecimal carPrice;

    @Schema(description = "修改車輛品牌")
    private String carBrand;

    @Schema(description = "修改車輛型號")
    private String carModelName;
}
