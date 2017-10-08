package cn.happy.springthrow1006_04;

import org.springframework.aop.ThrowsAdvice;

/**
 * Created by LY on 2017/10/6.
 */
public class MyThrowsAdvice implements ThrowsAdvice {
     public void afterThrowing(Exception ex){
         System.out.println("错误 ");
     }
}
