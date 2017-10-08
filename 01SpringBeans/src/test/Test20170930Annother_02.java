
import cn.happy.spring0930_02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by LY on 2017/9/30.
 */
public class Test20170930Annother_02 {

    @Test/*设织入住之Collection*/
    public void initial(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContexttestXmlspringAnnotabiondl.xml");
        Student all = (Student) ctx.getBean("student");
        System.out.println(all);

    }

}
