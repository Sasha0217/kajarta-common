package com.kajarta.demo.enums;

import lombok.Getter;

@Getter
public enum PermissionStatusEnum {
    REVIEW(1,"簽核中"),
    APPROVE(2,"同意"),
    REJECT(3,"拒絕");

    private final int code;
    private final String description;

    PermissionStatusEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public static PermissionStatusEnum getByCode(Integer code) {
        if (code != null) {
            for (PermissionStatusEnum permissionStatusEnum : values()) {
                if (permissionStatusEnum.getCode() == code) {
                    return permissionStatusEnum;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return code + "|" + description;
    }
}
