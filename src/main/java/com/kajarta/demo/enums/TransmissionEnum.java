package com.kajarta.demo.enums;

import lombok.Getter;

@Getter
public enum TransmissionEnum {

    AUTOMATIC(1, "自排"),
    Manual(2, "手排"),
    SemiAutomatic(3, "手自排"),
    AutomaticManual(4, "自手排");

    private final Integer code;
    private final String transmission;

    TransmissionEnum(Integer code, String transmission) {
        this.code = code;
        this.transmission = transmission;
    }

    public static TransmissionEnum getByCode(Integer code) {
        if (code != null) {
            for (TransmissionEnum suspensionListEnum : TransmissionEnum.values()) {
                if (suspensionListEnum.getCode() == code) {
                    return suspensionListEnum;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return code + "|" + transmission;
    }

}
