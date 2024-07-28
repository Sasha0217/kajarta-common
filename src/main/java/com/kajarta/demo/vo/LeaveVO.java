package com.kajarta.demo.vo;


import com.kajarta.demo.page.Pages;
import io.swagger.v3.oas.annotations.media.Schema;

import lombok.*;


import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LeaveVO extends Pages implements Serializable {
    private Integer id;

    @Schema(description = "請假類型:0-請假 1-給假")
    private Integer leaveStatus;

    @Schema(description = "開始時段")
    private String startTime;

    @Schema(description = "結束時段")
    private String endTime;

    @Schema(description = "假種")
    private Integer leaveType;

    @Schema(description = "假種名稱")
    private String leaveTypeName;

    @Schema(description = "休假員工")
    private Integer employeeId;

    @Schema(description = "休假員工姓名")
    private String employeeName;

    @Schema(description = "代理員工")
    private Integer deputyId;

    @Schema(description = "代理員工姓名")
    private String deputyName;

    @Schema(description = "核可主管")
    private Integer teamLeaderId;

    @Schema(description = "主管審核備註")
    private String permisionRemarks;

    @Schema(description = "核可狀態:1-簽核中 2-同意 3-拒絕")
    private Integer permisionStatus;

    @Schema(description = "核可時間")
    private String auditTime;

    @Schema(description = "請假事由")
    private String reason;

    @Schema(description = "實際請假時數")
    private Integer actualLeaveHours;

    @Schema(description = "請假證明圖檔")
    private byte[] image;

    @Schema(description = "特殊假時數")
    private Integer specialLeaveHours;

    @Schema(description = "建立時間")
    private String createTime;

    @Schema(description = "更新時間")
    private String updateTime;

    @Schema(description = "開始使用期限")
    private String validityPeriodStart;

    @Schema(description = "截止使用期限")
    private String validityPeriodEnd;
}
