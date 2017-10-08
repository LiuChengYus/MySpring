import cn.happy.spring0930.entity.User;
import cn.happy.spring0930.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by LY on 2017/9/30.
 */
public class Test20170930 {

    @Test/*当我们创建了ApplicationContex的时候所有的beans对象都会被初始化*/
    public void initial(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        User entity = (User) ctx.getBean("entity");
        User entity2 = (User) ctx.getBean("entity");
        System.out.println(entity);
        System.out.println(entity2);
        //证明了该对象实在创建的时候就已经管理了getBean方法只是从千千万万的找到这和beans
    }

    @Test/*当我们创建了ApplicationContex的时候所有的beans对象都会被初始化*/
    public void LoggerbBeforeAdvice(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService service = (IUserService) ctx.getBean("service");
        User user=new User();
        service.save2(user);
    }
}
