package Test;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * 创建测试类
 */
public class BigDecimalTest {


    /**
     * 没有用BigDecimal直接打印,结果丢失精度
     */
    @Test
    public void test1(){
        System.out.println(0.01+0.05);
        System.out.println(0.1-0.042);
        System.out.println(2.089*100);
        System.out.println(4.32/100);
    }

    /**
     * 使用BigDecimal的String方法  解决丢失精度问题
     */
    @Test
    public void test2(){
        BigDecimal b1=new BigDecimal("0.01");
        BigDecimal b2=new BigDecimal("0.03");
        System.out.println(b1.add(b2));
    }
}
