package com.kajarta.demo.enums;

/**
 * 異常訊息enum
 */
public enum SystemExceptionEnum implements ExceptionEnum {
    SUCCESS(200, "成功"),
    UNKNOWN_ERROR(5001, "未知錯誤"),
    SYSTEM_ERROR(5002, "系統異常"),

    TOKEN_NOT_NULL(5004, "token不能為空"),
    TOKEN_OVERDUE(5005, "token過期"),

    FREQUENT_REQUESTS(5006,"請求過於頻繁"),

    ADD_FAIL(5007,"添加失敗"),
    MODIFY_FAIL(5008,"修改失敗"),
    DELETE_FAIL(5009,"刪除失敗"),
    QUERY_FAIL(5010,"查詢異常"),
    PARAMS_CHECK(5011, "缺少參數");

    private Integer code;

    private String msg;

    SystemExceptionEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static SystemExceptionEnum getCode(String param) {
        for (SystemExceptionEnum exceptionEnum : SystemExceptionEnum.values()) {
            String variable = exceptionEnum.toString().replaceAll("_", "");
            if (param.equalsIgnoreCase(variable)) {
                return exceptionEnum;
            }
        }
        return SystemExceptionEnum.PARAMS_CHECK;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }
}
