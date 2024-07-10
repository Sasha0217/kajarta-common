package com.kajarta.demo.enums;

import lombok.Getter;

@Getter
public enum CityEnum {
    TAIPEI_CITY(1,"台北市"),
    NEW_TAIPEI_CITY(2,"新北市"),
    TAOYUAN_CITY(3,"桃園市"),
    TAICHUNG_CITY(4,"台中市"),
    TAINAN_CITY(5,"台南市"),
    KAOHSIUNG_CITY(6,"高雄市"),
    KEELUNG_CITY(7,"基隆市"),
    HSINCHU_CITY(8,"新竹市"),
    HSINCHU_COUNTY(9,"新竹縣"),
    CHIAYI_CITY(10,"嘉義市"),
    CHIAYI_COUNTY(11,"嘉義縣"),
    MIAOLI_COUNTY(12,"苗栗縣"),
    CHANGHUA_COUNTY(13,"彰化縣"),
    NANTOU_COUNTY(14,"南投縣"),
    YUNLIN_COUNTY(15,"雲林縣"),
    PINGTUNG_COUNTY(16,"屏東縣"),
    YILAN_COUNTY(17,"宜蘭縣"),
    HUALIEN_COUNTY(18,"花蓮縣"),
    TAITUNG_COUNTY(19,"台東縣");

    private final int code;
    private final String city;

    CityEnum(int code, String city) {
        this.code = code;
        this.city = city;
    }

    public static CityEnum getByCode(Integer code) {
        if (code != null) {
            for (CityEnum cityEnum : values()) {
                if (cityEnum.getCode() == code) {
                    return cityEnum;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return code + "|" + city;
    }
}
