package com.kajarta.demo.enums;

import lombok.Getter;

@Getter
public enum LeaveStatusEnum {
    DEDUCT(0,"請假"),
    ADD(1,"給假"),;

    private final int code;
    private final String description;

    LeaveStatusEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public static LeaveStatusEnum getByCode(Integer code) {
        if (code != null) {
            for (LeaveStatusEnum cityEnum : values()) {
                if (cityEnum.getCode() == code) {
                    return cityEnum;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return code + "|" + description;
    }
}
