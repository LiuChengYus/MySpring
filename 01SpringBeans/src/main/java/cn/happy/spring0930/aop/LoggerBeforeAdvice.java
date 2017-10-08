package cn.happy.spring0930.aop;


import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by LY on 2017/9/30.
 */
public class LoggerBeforeAdvice implements MethodBeforeAdvice {
    /**
     *
     * @param method 目标对象的方法
     * @param objects  方法的参数
     * @param o   目标对象
     * @throws Throwable
     */
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("=============在我之前================");
    }
}
