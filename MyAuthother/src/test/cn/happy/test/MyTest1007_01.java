package cn.happy.test;
import cn.happy.spring1007_01.Student;
import cn.happy.spring1007_02.ISomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by LY on 2017/10/7.
 */
public class MyTest1007_01 {

    //aspectj xml 配置
    @Test
    public void test04(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext1007_03.xml");
        cn.happy.spring1007_03.ISomeService service = (cn.happy.spring1007_03.ISomeService) ctx.getBean("someService");
        service.insert();
        service.delete();
        service.update();
        service.select();

    }

    //事务  开启
    @Test
    public void test03(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext1007_02.xml");
        ISomeService service = (ISomeService) ctx.getBean("someService");
        service.insert();
        service.delete();
        service.update();
        service.select();

    }


    //异常增强  最终增强无论怎么怎样都执行
    @Test
    public void test02(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext1007_02.xml");
        ISomeService service = (ISomeService) ctx.getBean("someService");
       /* service.doSome();
        service.add();*/

    }

    //构造入住
    @Test
    public void test01(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext1007_01.xml");
        Student student = (Student) ctx.getBean("student");
        System.out.println(student);

    }
}
