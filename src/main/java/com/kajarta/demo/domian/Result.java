package com.kajarta.demo.domian;

import lombok.Data;

/**
 * result實體類，使用泛行
 */
@Data
public class Result<T> {

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

    /*
     * 傳回總頁數 page.gettotalPage
     * Enzo新增 用以分頁
     */
    private Integer totalPage; // 傳回總頁數。

    /*
     * 傳回元素的總數 page.gettotalElement
     * Enzo新增 用以分頁
     */
    private Long totalElement;

    /*
     * 傳回當前頁數 page.getNumber
     * Enzo新增 用以分頁
     */
    private Integer PageNumber;

    /*
     * 傳回當前頁面上元素的數量 page.getNumberOfElements
     * Enzo新增 用以分頁
     */
    private Integer NumberOfElementsOnPage;

    /*
     * 傳是否有下一頁 page.hasNext()
     * Enzo新增 用以分頁
     */
    private boolean hasNext;

    /*
     * 傳是否有上一頁 page.hasPrevious()
     * Enzo新增 用以分頁
     */
    private boolean hasPrevious;

    /*
     * 傳是否是第一頁 page.isFirst()
     * Enzo新增 用以分頁
     */
    private boolean isFirstPageOrNot;

    /*
     * 傳是否是最後頁 page.isLast()
     * Enzo新增 用以分頁
     */
    private boolean isLastPageOrNot;

}
