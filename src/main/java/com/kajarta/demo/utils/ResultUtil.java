package com.kajarta.demo.utils;

import com.kajarta.demo.domian.Result;
import com.kajarta.demo.enums.ExceptionEnum;
import com.kajarta.demo.enums.SystemExceptionEnum;

/**
 * resultutil to form the result
 * 結果封裝，統一輸出結果or異常
 */
public class ResultUtil {

    /**
     * 返回成功
     *
     * @param t
     * @return
     */
    public static <T> Result<T> success(T t) {
        Result<T> result = new Result<>();
        result.setCode(SystemExceptionEnum.SUCCESS.getCode());
        result.setMsg(SystemExceptionEnum.SUCCESS.getMsg());
        result.setData(t);
        result.setSuccess(true);
        return result;
    }

    /**
     * 返回成功，不需傳msg
     *
     * @return
     */
    public static <T> Result<T> success() {
        return success(null);
    }

    /**
     * 自定義錯誤訊息
     *
     * @param msg
     * @return
     */
    public static <T> Result<T> error(String msg) {
        Result<T> result = new Result<>();
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
    public static <T> Result<T> error(ExceptionEnum exceptionEnum) {
        Result<T> result = new Result<>();
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
    public static <T> Result<T> error(Integer code, String msg){
        Result<T> result = new Result<>();
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
    public static <T> Result<T> error(Integer code, String msg, T t){
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        result.setSuccess(false);
        result.setData(t);
        return result;
    }

}
