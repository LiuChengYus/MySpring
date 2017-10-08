package cn.happy.springmethodinterceptor1006aop_3;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by LY on 2017/10/6.
 */
public class MyMethodInterceptor implements MethodInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("before");
        invocation.proceed();
        System.out.println("after");
        return null;
    }
}
