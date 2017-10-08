
import cn.happy.spring0930_01.MyCollection;
import cn.happy.spring0930_01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by LY on 2017/9/30.
 */
public class Test20170930Collection_01 {

    @Test/*设织入住之Collection*/
    public void initial(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContexttestCollection.xml");
        MyCollection all = (MyCollection) ctx.getBean("properties");
        System.out.println(all.getArray());
        System.out.println(all.getList());
        System.out.println(all.getSet());
        System.out.println(all.getMap());
        System.out.println(all.getProperties());
    }

}
