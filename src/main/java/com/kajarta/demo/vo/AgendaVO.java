package com.kajarta.demo.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    @Schema(description = "排程開始時間String")
    private String unavailableTimeStrString;

    @Schema(description = "排程結束時間String")
    private String unavailableTimeEndString;

    @Schema(description = "排程分類名稱")
    private String unavailableStatusName;

    @Schema(description = "排程分類編號")
    private Integer unavailableStatus;

    @Schema(description = "創建時間String")
    private String createTimeString;

    @Schema(description = "更新時間String")
    private String updateTimeString;

}
