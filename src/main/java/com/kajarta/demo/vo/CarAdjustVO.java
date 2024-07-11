package com.kajarta.demo.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

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

    @Schema(description = "簽核狀態")
    private String approvalStatusName;

    @Schema(description = "簽核種類")
    private String approvalTypeName;

    @Schema(description = "最終異動金額")
    private BigDecimal floatingAmount;

    @Schema(description = "創建時間")
    private Date createTime;

    @Schema(description = "更新時間")
    private Date updateTime;

}
