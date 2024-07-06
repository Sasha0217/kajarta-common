package com.kajarta.demo.enums;

import lombok.Getter;

@Getter
public enum Negotiable {
    FIVE(1, "5%"),
    TEN(2, "10%"),
    FIFTEEN(3, "15%"),
    TWENTY(4, "20%");

    private final Integer code;
    private final String percent;

    Negotiable(Integer code, String percent) {
        this.code = code;
        this.percent = percent;
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
