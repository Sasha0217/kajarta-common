package com.kajarta.demo.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AgendaVO {
    private Integer id;

    @Schema(description = "排程員工ID")
    private Integer employeeId;

    @Schema(description = "排程員工")
    private String employeeName;

    @Schema(description = "事由")
    private String businessPurpose;

    @Schema(description = "排程開始時間")
    private Date unavailableTimeStr;

    @Schema(description = "排程結束時間")
    private Date unavailableTimeEnd;

    @Schema(description = "排程分類名稱")
    private String unavailableStatusName;

    @Schema(description = "排程分類編號")
    private Integer unavailableStatus;

    @Schema(description = "創建時間")
    private Date createTime;

    @Schema(description = "更新時間")
    private Date updateTime;

}
