package com.kajarta.demo.enums;

import lombok.Getter;

@Getter
public enum BrandEnum {

    HONDA(1, "本田"),
    TOYOTA(2, "豐田"),
    MAZDA(3, "馬自達"),
    BENZ(4, "賓士"),
    PORSCHE(5, "保時捷"),
    BMW(6, "寶馬"),
    VOLKSWAGEN(7, "福斯"),
    NISSAN(8, "日產"),
    SUBARU(9, "速霸陸");

    private final int code;
    private final String trademark;

    BrandEnum(int code, String trademark) {
        this.code = code;
        this.trademark = trademark;
    }

    public static BrandEnum getByCode(Integer code) {
        if (code != null) {
            for (BrandEnum brandEnum : values()) {
                if (brandEnum.getCode() == code) {
                    return brandEnum;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return code + "|" + trademark;
    }
}
