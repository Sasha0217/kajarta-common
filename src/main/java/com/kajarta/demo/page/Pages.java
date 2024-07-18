package com.kajarta.demo.page;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 分頁
 * </p>
 *
 * @author Sasha
 * @since 2024-07-17
 */
@Data
public class Pages implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 頁數
     */
    private Integer pageNum = 1;

    /**
     * 顯示條數
     */
    private Integer pageSize = 10;


    public void setPageNum(Integer pageNum) {
        if (pageNum == null) {
            pageNum = 1;
        }
        this.pageNum = pageNum;
    }

    public void setPageSize(Integer pageSize) {
        if (pageSize == null) {
            pageSize = 10;
        }
        this.pageSize = pageSize;
    }


}
