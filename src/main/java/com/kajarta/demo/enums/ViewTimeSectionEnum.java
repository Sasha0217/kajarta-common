package com.kajarta.demo.enums;

import lombok.Getter;

@Getter
public enum ViewTimeSectionEnum {

    MORNING_SESSION(1, "10:00:00-12:00:00"),
    AFTERNOON_SESSION_1(2, "13:00:00-15:00:00"),
    AFTERNOON_SESSION_2(3, "15:00:00-17:00:00"),
    EVENING_SESSION(4, "17:00:00-19:00:00");

    private final int code;
    private final String timeRange;

    ViewTimeSectionEnum(int code, String timeRange) {
        this.code = code;
        this.timeRange = timeRange;
    }

    public static ViewTimeSectionEnum getByCode(Integer code) {
        if (code != null) {
            for (ViewTimeSectionEnum section : values()) {
                if (section.getCode() == code) {
                    return section;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return code + "|" + timeRange;
    }
}