package com.kajarta.demo.enums;

import lombok.Getter;

@Getter
public enum DisplacementEnum {

    THOUSANDTWO(1, "1200以下"),
    THOUSANDEIGHT(2, "1201-1800"),
    TWOTHOUSANDFOUR(3, "1801-2400"),
    THREETHOUSAND(4, "2401-3000"),
    FOURTHOUSANDTWOHUNDRED(5, "3001-4200"),
    FIVETHOUSANDFOURHUNDRED(6, "4201-5400"),
    UPFIVETHOUSANDFOURHUNDRED(7, "5401以上");

    private final Integer code;
    private final String cc;

    DisplacementEnum(Integer code, String cc) {
        this.code = code;
        this.cc = cc;
    }

    public static DisplacementEnum getByCode(Integer code) {
        if (code != null) {
            for (DisplacementEnum displacementEnum : DisplacementEnum.values()) {
                if (displacementEnum.getCode() == code) {
                    return displacementEnum;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return code + "|" + cc;
    }

}
