package com.kajarta.demo.enums;

import lombok.Getter;

@Getter
public enum RearWheelEnum {
    FRONT(1, "前驅"),
    REAR(2, "後驅"),
    FOUR(3, "四驅");

    private final Integer code;
    private final String wheel;

    RearWheelEnum(Integer code, String wheel) {
        this.code = code;
        this.wheel = wheel;
    }

    public static RearWheelEnum getByCode(Integer code) {
        if (code != null) {
            for (RearWheelEnum rearWheelEnum : RearWheelEnum.values()) {
                if (rearWheelEnum.getCode() == code) {
                    return rearWheelEnum;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return code + "|" + wheel;
    }

}
