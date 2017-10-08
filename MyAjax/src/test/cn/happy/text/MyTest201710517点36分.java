package cn.happy.text;

import cn.happy.entity.OneAnnotation;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * Created by LY on 2017/10/5.
 */
public class MyTest201710517点36分 {
    @Test
    public void MyTest() throws  Exception{
       // 提取到被注解的方法Method，这里用到了反射的知识  
          Method method = Class.forName("cn.happy.entity.OneClass").getDeclaredMethod("oneMethod");
          // 从Method方法中通过方法getAnnotation获得我们设置的注解  
          OneAnnotation oneAnnotation = method.getAnnotation(OneAnnotation.class);
        System.out.println(oneAnnotation.name());
        System.out.println(oneAnnotation.age());
    }
}






























