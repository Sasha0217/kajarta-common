package com.kajarta.demo.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    public static final String YYYY_MM_DD_HH_MM = "yyyy-MM-dd HH:mm";
    public static final String YYYY_MM_DD_T_HH_MM = "yyyy-MM-dd'T'HH:mm";

    public static Date getDateDayEndOfYear(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, 11);
        calendar.set(Calendar.DAY_OF_MONTH, 31);
        return calendar.getTime();
    }

    public static Date getDateDayStartOfYear(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        return calendar.getTime();
    }

    public static String getDayStartOfYear(){
        SimpleDateFormat dateFormat = new SimpleDateFormat(YYYY_MM_DD_HH_MM);

        // 获取当前年份
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);

        // 设置为今年的第一天
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        String firstDayOfYear = dateFormat.format(calendar.getTime());
        return firstDayOfYear;
    }

    public static String getDayEndOfYear(){
        SimpleDateFormat dateFormat = new SimpleDateFormat(YYYY_MM_DD_HH_MM);

        // 获取当前年份
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);

        // 设置为今年的最后一天
        calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 31);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        String lastDayOfYear = dateFormat.format(calendar.getTime());
        return lastDayOfYear;
    }

    public static String getDayStartOfYearIso(){
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(YYYY_MM_DD_T_HH_MM);

        // 获取当前年份的第一天
        LocalDateTime firstDayOfYear = LocalDateTime.of(LocalDateTime.now().getYear(), 1, 1, 0, 0);

        // 格式化为字符串
        return firstDayOfYear.format(dateFormatter);
    }

    public static String getDayEndOfYearIso(){
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(YYYY_MM_DD_T_HH_MM);

        // 获取当前年份的最后一天
        LocalDateTime lastDayOfYear = LocalDateTime.of(LocalDateTime.now().getYear(), 12, 31, 23, 59);

        // 格式化为字符串
        return lastDayOfYear.format(dateFormatter);
    }
}
