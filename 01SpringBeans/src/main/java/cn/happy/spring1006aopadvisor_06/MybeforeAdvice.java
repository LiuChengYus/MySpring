package cn.happy.spring1006aopadvisor_06;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by LY on 2017/10/6.
 */
//前置通知
public class MybeforeAdvice implements MethodBeforeAdvice{
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("===============log=============");
    }
}
