package com.kajarta.demo.enums;

import lombok.Getter;

/**
 * 分店類型:1-北部 2-中部 3-南部"
 */
@Getter
public enum BranchEnum {

    // 前面的命名規定一定要大寫
    TAIPEI(1, "台北市", "大吉祥"),
    TAICHUNG(2, "台中市", "大滿貫"),
    KAOHSIUNG(3, "高雄市", "大巨蛋");

    private final int code;
    private final String city;
    private final String branchName;

    // 需生成建構子
    BranchEnum(int code, String city, String branchName) {
        this.code = code;
        this.city = city;
        this.branchName = branchName;
    }

    // 寫別的ENUM可以照抄這裡，這裡代表跑迴圈去比對到哪一個code，則會return整筆資料
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
    // 可用lombook生成toString，或者是自行改寫toString的用法，之後可以印出log看
    @Override
    public String toString() {
        return code + "|" + city + "|" + branchName;
    }

}
