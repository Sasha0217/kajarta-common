package com.kajarta.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class LeaveDTO {
    private Integer id;
    private Integer leaveStatus;
    private Date startTime;
    private Date endTime;
    private Integer leaveType;
    private Integer employeeId;
    private Integer deputyId;
    private Integer teamLeaderId;
    private String permisionRemarks;
    private Integer permisionStatus;
    private Date auditTime;
    private String reason;
    private Integer actualLeaveHours;
    private byte[] image;
    private Integer specialLeaveHours;
    private Date createTime;
    private Date updateTime;
    private Date validityPeriodStart;
    private Date validityPeriodEnd;
    private String deputyName; // 如果需要在DTO中包含这个字段的话
    private String employeeName;
}
