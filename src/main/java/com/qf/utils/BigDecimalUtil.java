package com.qf.utils;

import java.math.BigDecimal;

/**
 * 定义工具类解决double型价格浮点精度丢失问题
 * 使用BigDecimal的String构造器
 */
public class BigDecimalUtil {

    //私有构造器,防止外部实例化
    private BigDecimalUtil(){

    }

    /**
     * 加法
     * @param a1
     * @param a2
     * @return
     */
    public static BigDecimal add(double a1,double a2){
        BigDecimal b1=new BigDecimal(Double.toString(a1));
        BigDecimal b2=new BigDecimal(Double.toString(a2));
        return b1.add(b2);
    }

    /**
     * 减法
     * @param a1
     * @param a2
     * @return
     */
    public static BigDecimal sub(double a1,double a2){
        BigDecimal b1=new BigDecimal(Double.toString(a1));
        BigDecimal b2=new BigDecimal(Double.toString(a2));
        return b1.subtract(b2);
    }

    /**
     * 乘法
     * @param a1
     * @param a2
     * @return
     */
    public static BigDecimal mul(double a1,double a2){
        BigDecimal b1=new BigDecimal(Double.toString(a1));
        BigDecimal b2=new BigDecimal(Double.toString(a2));
        return b1.multiply(b2);
    }

    /**
     * 除法
     * @param a1
     * @param a2
     * @return
     */
    public static BigDecimal div(double a1,double a2){
        BigDecimal b1=new BigDecimal(Double.toString(a1));
        BigDecimal b2=new BigDecimal(Double.toString(a2));
        //除不尽的情况,四舍五入保留两位小数
        return b1.divide(b2,2,BigDecimal.ROUND_HALF_UP);
    }
}
