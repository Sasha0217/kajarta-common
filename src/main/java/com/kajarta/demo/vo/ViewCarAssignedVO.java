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
public class ViewCarAssignedVO {

    private Integer id;

    @Schema(description = "主管")
    private String teamLeaderName;

    @Schema(description = "建立修改員工")
    private String employeeName;

    @Schema(description = "主管Id")
    private Integer teamLeaderId;

    @Schema(description = "建立修改員工Id")
    private Integer employeeId;

    @Schema(description = "賞車編號")
    private Integer viewCarId;

    @Schema(description = "指派狀態")
    private String assignedStatusName;

    @Schema(description = "指派狀態(編號)")
    private Integer assignedStatus;

    @Schema(description = "創建時間String")
    private String createTimeString;

    @Schema(description = "更新時間String")
    private String updateTimeString;
}
