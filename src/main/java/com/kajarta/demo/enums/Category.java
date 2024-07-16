package com.kajarta.demo.enums;

import lombok.Getter;

@Getter
public enum Category {
//"親愛的XXX，提醒您，三天後有XXX試駕，屆時請攜駕照前往謝謝。"
    VIEWCAR_THREE(1, "三天後有"),
    VIEWCAR_ONE(2, "一天後有");
    //"非常感謝XXX今日的蒞臨，點擊留下您寶貴的意見。"(判斷是否大於賞車日期)
    //"親愛的XXX，您的心儀車輛XXX上架了，快來看看吧!"


    private final Integer code;
    private final String viewCarDate;

    Category(Integer code, String viewCarDate) {
        this.code = code;
        this.viewCarDate = viewCarDate;
    }

    public static Category getByCode(Integer code) {
        if (code != null) {
            for (Category CategoryEnum : Category.values()) {
                if (CategoryEnum.getCode() == code) {
                    return CategoryEnum;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return code + "|" + viewCarDate;
    }

}
