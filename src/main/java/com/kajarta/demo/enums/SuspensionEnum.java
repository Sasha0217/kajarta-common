package com.kajarta.demo.enums;

import lombok.Getter;

@Getter
public enum SuspensionEnum {

    SEDAN(1, "轎車"),
    SUV(2, "休旅車"),
    CONVERTIBLE(3, "敞篷車"),
    SPORTS_CAR(4, "跑車"),
    JEEP(5, "吉普車"),
    HATCHBACK(6, "掀背車");

    private final Integer code;
    private final String type;

    SuspensionEnum(int code, String type) {
        this.code = code;
        this.type = type;
    }

    public static SuspensionEnum getByCode(Integer code) {
        if (code != null) {
            for (SuspensionEnum carTypeEnum : values()) {
                if (carTypeEnum.getCode() == code) {
                    return carTypeEnum;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return code + "|" + type;
    }
}
