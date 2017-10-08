package cn.happy.test;

import cn.happy.spring_01.ISomeService;
import cn.happy.spring_02.MyCollection;
import cn.happy.spring_02.Student;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


/**
 * Created by LY on 2017/10/7.
 */
public class Test2017年10月7日14点16分_01 {
    @Test//byName  byType自动匹配
    public void test05(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext_03.xml");
        cn.happy.spring_03.Student stu = (cn.happy.spring_03.Student) ctx.getBean("stu");
        System.out.println(stu);
    }


    @Test//BeanFactory//resource 导的是io的包
    public void test04(){
        //这个比较古老的是多利的
        Resource resource=new ClassPathResource("applicationContext_02.xml");
        BeanFactory ctx=new XmlBeanFactory(resource);
        ctx.getBean("MyClloction");
    }
    @Test//集合入住
    public void test03(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext_02.xml");
        MyCollection stu = (MyCollection) ctx.getBean("MyClloction");
        System.out.println(stu);
    }
    @Test//构造入住
    public void test02(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext_02.xml");
        Student stu = (Student) ctx.getBean("stu");
        System.out.println(stu);
    }
    @Test//设置入住
    public void test01(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext_01.xml");
        ISomeService service = (ISomeService) ctx.getBean("someService");
        service.doSome();
    }
}
