package com.kajarta.demo.utils;

import com.kajarta.demo.domian.ResultNew;
import com.kajarta.demo.enums.ExceptionEnum;
import com.kajarta.demo.enums.SystemExceptionEnum;

/**
 * resultutil to form the result
 * 結果封裝，統一輸出結果or異常
 */
public class ResultUtilNew {

    /**
     * 返回成功
     *
     * @param t
     * @return
     */
    public static <T> ResultNew<T> success(T t) {
        ResultNew<T> result = new ResultNew<>();
        result.setCode(SystemExceptionEnum.SUCCESS.getCode());
        result.setMsg(SystemExceptionEnum.SUCCESS.getMsg());
        result.setData(t);
        result.setSuccess(true);
        return result;
    }

    public static <T> ResultNew<T> success(T t, String msg) {
        ResultNew<T> result = new ResultNew<>();
        result.setCode(SystemExceptionEnum.SUCCESS.getCode());
        result.setMsg(msg);
        result.setData(t);
        result.setSuccess(true);
        return result;
    }

    /**
     * 返回成功，不需傳msg
     *
     * @return
     */
    public static <T> ResultNew<T> success() {
        return success(null);
    }

    /**
     * 自定義錯誤訊息
     *
     * @param msg
     * @return
     */
    public static <T> ResultNew<T> error(String msg) {
        ResultNew<T> result = new ResultNew<>();
        result.setMsg(msg);
        result.setData(null);
        result.setSuccess(false);
        return result;
    }

    /**
     * 返回異常訊息，在已知範圍
     *
     * @param exceptionEnum
     * @return
     */
    public static <T> ResultNew<T> error(ExceptionEnum exceptionEnum) {
        ResultNew<T> result = new ResultNew<>();
        result.setCode(exceptionEnum.getCode());
        result.setMsg(exceptionEnum.getMsg());
        result.setSuccess(false);
        result.setData(null);
        return result;
    }

    /**
     * 錯誤返回
     * @param code 錯誤碼
     * @param msg  錯誤訊息
     * @param <T>  泛行
     * @return
     */
    public static <T> ResultNew<T> error(Integer code, String msg){
        ResultNew<T> result = new ResultNew<>();
        result.setCode(code);
        result.setMsg(msg);
        result.setSuccess(false);
        result.setData(null);
        return result;
    }

    /**
     * 錯誤返回
     * @param code 錯誤碼
     * @param msg  錯誤訊息
     * @param t    詳細數據
     * @param <T>  泛行
     * @return
     */
    public static <T> ResultNew<T> error(Integer code, String msg, T t){
        ResultNew<T> result = new ResultNew<>();
        result.setCode(code);
        result.setMsg(msg);
        result.setSuccess(false);
        result.setData(t);
        return result;
    }

}
