package com.kajarta.demo.enums;

import lombok.Getter;

/*
一般假別
特休 / 事假 / 病假

特殊假別
生理假
婚假 / 喪假 / 產假 / 陪產假 - 主管給假
公假-主管給假
*/
@Getter
public enum LeaveTypeEnum {
    // 員工年資四年內
    ANNUAL_HALF_YEAR(1, "特休", 24),
    ANNUAL_ONE_YEAR(2, "特休", 56),
    ANNUAL_TWO_YEARS(3, "特休", 80),
    ANNUAL_THREE_OR_FOUR_YEARS(4, "特休", 112),
    PERSONAL(5, "事假", 112),
    SICK(6, "半薪病假", 240),
    MARRIAGE(7, "婚假", 64),
    MENSTRUAL(8, "生理假", 8),
    OFFICIAL(9, "公假", 1),
    BEREAVEMENT_PARENT_OR_SPOUSE(10, "喪假", 64),
    BEREAVEMENT_CHILD_OR_GRANDPARENT_OR_SPOUSEPARENT(11, "喪假", 48),
    BEREAVEMENT_GREATGRANDPARENT_OR_SIBLING_SPOUSEGRANDPARENT(12, "喪假", 24);

    private final int code;
    private final String leaveType;
    private final int hoursPolicy;

    LeaveTypeEnum(int code, String leaveType, int hoursPolicy) {
        this.code = code;
        this.leaveType = leaveType;
        this.hoursPolicy = hoursPolicy;
    }

    public static LeaveTypeEnum getByCode(Integer code) {
        if (code != null) {
            for (LeaveTypeEnum leaveTypeEnum : values()) {
                if (leaveTypeEnum.getCode() == code) {
                    return leaveTypeEnum;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return code + "|" + leaveType + "|" + hoursPolicy;
    }


}
