package com.kajarta.demo.domian;

import lombok.Data;

/**
 * result實體類，使用泛行
 */
@Data
public class ResultNew<T> {

    /**
     * code
     */
    private Integer code;

    /**
     * msg
     */
    private String msg;

    /**
     * data
     */
    private T data = null;

    private Boolean success;

}
