package com.kajarta.demo.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
import com.kajarta.demo.model.Employee;
import com.kajarta.demo.model.ViewCar;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ViewCarAssignedVO {

    private Integer id;

    @Schema(description = "主管ID")
    private Integer teamLeaderId;

    @Schema(description = "建立修改員工")
    private Employee employee;

    @Schema(description = "賞車編號")
    private ViewCar viewCar;

    @Schema(description = "指派狀態")
    private Integer assignedStatus;

    @Schema(description = "創建時間")
    private Date createTime;

    @Schema(description = "更新時間")
    private Date updateTime;
}
