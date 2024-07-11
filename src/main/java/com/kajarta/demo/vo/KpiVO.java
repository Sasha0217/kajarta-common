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
public class KpiVO {

    private Integer id;

    @Schema(description = "季度開始日")
    private Date seasonStrDay;

    @Schema(description = "主管評分")
    private Integer teamLeaderRating;

    @Schema(description = "實際KPI分數")
    private BigDecimal totalScore;

    @Schema(description = "賞車客人平均給分")
    private Integer salesScore;

    @Schema(description = "員工")
    private String employeeName;

    @Schema(description = "員工主管")
    private String teamLeaderName;

    @Schema(description = "創建時間")
    private Date createTime;

    @Schema(description = "更新時間")
    private Date updateTime;
}
