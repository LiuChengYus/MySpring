package cn.happy.spring0930_02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
//API  javax jdk 普通的
import javax.annotation.Resource;

/**
 * Created by LY on 2017/9/30.
 */
//使用了Componeent,默认名称是类名首字母小写作为Spring的对象名
@Component()
/*@Service
@Controller
@Repository*/
public class Student {
    @Value("小贱贱")//setxxx设置注入，反射机制
    private String name;
    @Value("180")
    private int age;
    @Resource()  //注入byName  byType  JDK的注解
    @Autowired()
    @Qualifier("car")
    private Car car2;
    //在真实运作中，推荐大家 还是使用get和set,原因是因为xml配置bean节点，
    public void getData(){
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car2 +
                '}';
    }
}
