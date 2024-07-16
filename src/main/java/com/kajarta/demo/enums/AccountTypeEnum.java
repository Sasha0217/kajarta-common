package com.kajarta.demo.enums;

import lombok.Getter;

@Getter
public enum AccountTypeEnum {
    REGULAR_CUSTOMER(1,"一般會員"),
    SELLER_CUSTOMER(2,"會員賣家"),
    SALES(3,"銷售業務"),
    TEAM_LEADER(4,"主管"),
    DEACTIVATE_REGULAR_CUSTOMER(5,"一般會員-帳號註銷"),
    DEACTIVATE_SELLER_CUSTOMER(6,"會員賣家-帳號註銷"),
    DEACTIVATE_SALES(7,"銷售業務-帳號註銷"),
    DEACTIVATE_TEAM_LEADER(8,"主管-帳號註銷");




    private final int code;
    private final String accountType;

    AccountTypeEnum(int code, String accountType) {
        this.code = code;
        this.accountType = accountType;
    }

    public static AccountTypeEnum getByCode(Integer code) {
        if (code != null) {
            for (AccountTypeEnum accountTypeEnum : values()) {
                if (accountTypeEnum.getCode() == code) {
                    return accountTypeEnum;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return code + "|" + accountType;
    }
}
