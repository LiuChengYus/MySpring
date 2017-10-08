
import cn.happy.spring0930_01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by LY on 2017/9/30.
 */
public class Test20170930_01 {

    @Test/*当我们创建了ApplicationContex的时候所有的beans对象都会被初始化*/
    public void initial(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContexttestXmlDl.xml");
        Student xx = (Student) ctx.getBean("pid");
        System.out.println(xx);
    }

}
