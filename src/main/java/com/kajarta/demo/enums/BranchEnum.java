package com.kajarta.demo.enums;

import lombok.Getter;

/*
分店類型:1-北部 2-中部 3-南部"
 */
@Getter
public enum BranchEnum {

    // 前面的命名規定一定要大寫
    TAIPEI(1, "台北市","台北市大安區復興南路一段123號", "大吉祥"),
    TAICHUNG(2, "台中市","台中市北區學士路456號", "大滿貫"),
    KAOHSIUNG(3, "高雄市","高雄市苓雅區四維三路456號", "大巨蛋");

    private final int code;
    private final String city;
    private final String address;
    private final String branchName;


    // 需生成建構子
    BranchEnum(int code, String city, String address, String branchName) {
        this.code = code;
        this.city = city;
        this.address = address;
        this.branchName = branchName;
    }

    // 寫別的ENUM可以照抄這裡，這裡代表跑迴圈去比對到哪一個code，則會return清單中的對應資料
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
        return code + "|" + city + "|" + address+"|"+ branchName;
    }

}
