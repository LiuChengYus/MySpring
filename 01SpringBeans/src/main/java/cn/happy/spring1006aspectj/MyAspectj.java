package cn.happy.spring1006aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by LY on 2017/10/6.
 */
@Aspect
public class MyAspectj {
    //@Before(value = "execution(* *..spring1006aspectj.*.*(..))")
    public void myBefore(){
        System.out.println("==============我是前置增强内容=========");
    }

    /*@After()最终增强*/
   // @AfterReturning(value = "execution(* *..spring1006aspectj.*.*(..))")
    public void myAfter(){
        System.out.println("==============我是后置增强内容=========");
    }

    @Around(value = "execution(* *..spring1006aspectj.*.*(..))" )
    public Object myAround(ProceedingJoinPoint p) throws Throwable {
        System.out.println("我是环绕前");
        Object result= p.proceed();
        System.out.println("我是环绕后");
        if(result!=null){
            String str=(String)result;
            return str.toUpperCase();
        }else{
            return null;
        }

    }
}
