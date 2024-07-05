package com.kajarta.demo.enums;

/*
特休 / 所有假別上限 -年資自動給
事假 / 病假 - 有請就有

生理假 - 特殊規則-主管給假
婚假 / 喪假 / 產假 / 陪產假 - 主管給假
公假-主管給假
 */

public enum leaveTypeEnums {
    ANNUAL(1,),
    PERSONAL(2,)

    private final int code;
    private final int type;
    private final int hourPolicy;

    /*
    病假剩餘時數(當年)
    sick_leave_hours(int)
    事假剩餘時數(當年)
    personal_leave_hours(int)
    特休剩餘時數(當年)
    annual_leave_hours(int)

    喪假剩餘時數
    bereavement _leave_hours(int)
    婚假剩餘時數
    marriage_leave_hours(int)
    產假剩餘時數
    maternal_leave_hours(int)
    陪產假剩餘時數
    paternity_leave_hours(int)
    生理假剩餘時數
    menstrual_leave_hours(int)
    公假剩餘時數
    official_leave_hours(int)
    */



}
