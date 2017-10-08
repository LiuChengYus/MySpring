package cn.happy.entity;


import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OneAnnotation {
    String name() default "小红";
    int age() default  1;

}
