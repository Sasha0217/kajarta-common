package com.kajarta.demo.enums;

import lombok.Getter;

@Getter
public enum NegotiableEnum {
    FIVE(1, "5%"),
    TEN(2, "10%"),
    FIFTEEN(3, "15%"),
    TWENTY(4, "20%");

    private final Integer code;
    private final String percent;

    NegotiableEnum(Integer code, String percent) {
        this.code = code;
        this.percent = percent;
    }

    public static NegotiableEnum getByCode(Integer code) {
        if (code != null) {
            for (NegotiableEnum negotiableEnum : NegotiableEnum.values()) {
                if (negotiableEnum.getCode() == code) {
                    return negotiableEnum;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return code + "|" + percent;
    }
}
