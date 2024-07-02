package com.kajarta.demo.enums;

import lombok.Getter;

/**
 * 分店類型:1-北部 2-中部 3-南部"
 */
@Getter
public enum BranchEnum {
    TAIPEI(1, "台北市", "大吉祥"),
    TAICHUNG(2, "台中市", "大滿貫"),
    KAOHSIUNG(3, "高雄市", "大巨蛋");

    private final int code;
    private final String city;
    private final String branchName;

    BranchEnum(int code, String city, String branchName) {
        this.code = code;
        this.city = city;
        this.branchName = branchName;
    }

    public static BranchEnum getByCode(Integer code) {
        if (code != null) {
            for (BranchEnum branchEnum : values()) {
                if (branchEnum.getCode() == code) {
                    return branchEnum;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return code + "|" + city + "|" + branchName;
    }

}
