package cn.happy.spring1007_02;


import org.aspectj.lang.annotation.*;

/**
 * Created by LY on 2017/10/7.
 */
@Aspect  //增强类
public class MyAspectj {

    @Pointcut("execution(* *..spring1007_02.*.*(..))")
    public void mypoint(){};


    @Pointcut("execution(* *..spring1007_02.*.insert(..))")
    public void insert(){}


    @Pointcut("execution(* *..spring1007_02.*.update(..))")
    public void update(){}

    @Pointcut("execution(* *..spring1007_02.*.delete(..))")
    public void delete(){}

    //前置增强
    @Before("insert()||update()||delete()")
    public void myBefore(){
        System.out.println("=======我是前置增强内容开启事务=======");
    }

    //最终增强
    @After("mypoint()")
    public void after(){
        System.out.println("我是最终增强");
    }
    //异常增强
    @AfterThrowing("mypoint()")
    public void throwing(){
        System.out.println("出错了");
    }
}
