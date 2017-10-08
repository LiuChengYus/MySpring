
import cn.happy.spring0930_01.MyCollection;
import cn.happy.spring1006_1.ProxySubject;
import cn.happy.spring1006_1.RealSubject;
import cn.happy.spring1006_1.Subject;
import cn.happy.spring1006_2.IUserDAO;
import cn.happy.spring1006_2.UserDAOImpl;
import cn.happy.spring1006_3.UserService;
import cn.happy.spring1006afteraop_2.ISomeService;
import cn.happy.spring1006aop_1.SomeService;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//反射用到的jar包
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test20171006Subject_01 {

    //aspectj  注解
    @Test
    public void test12(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContexttestspringaopadvisor09.xml");
        cn.happy.spring1006aspectj.ISomeService service=(cn.happy.spring1006aspectj.ISomeService)ctx.getBean("someService");
        service.doSome();
        String result = service.add();
        System.out.println(result);
    }

    //BeanName自动代理生成器 顾问 增强
    @Test
    public void test11(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContexttestspringaopadvisor08.xml");
        cn.happy.spring1006aopadvisor_08.ISomeService service=(cn.happy.spring1006aopadvisor_08.ISomeService)ctx.getBean("someService");
        service.doSome();
        service.add();
    }
    //默认Advisor自动代理生成器 顾问 增强
    @Test
    public void test10(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContexttestspringaopadvisor07.xml");
        cn.happy.spring1006aopadvisor_07.ISomeService service=(cn.happy.spring1006aopadvisor_07.ISomeService)ctx.getBean("someService");
        service.doSome();
        service.add();
    }
    //正则表达式匹配方法切入点 顾问 增强
    @Test
    public void test09(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContexttestspringaopadvisor06.xml");
        cn.happy.spring1006aopadvisor_06.ISomeService service=(cn.happy.spring1006aopadvisor_06.ISomeService)ctx.getBean("proxyService");
        service.doSome();
        service.doSecond();
    }
    //顾问 增强
    @Test
    public void test08(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContexttestspringaopadvisor05.xml");
        cn.happy.spring1006aopadvisor_05.ISomeService service=(cn.happy.spring1006aopadvisor_05.ISomeService)ctx.getBean("proxyService");
        service.doSome();
        service.doSecond();
    }

    //异常增强
    @Test
    public void test07(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContextestspringaopthrows04.xml");
        cn.happy.springthrow1006_04.ISomeService service=(cn.happy.springthrow1006_04.ISomeService)ctx.getBean("proxyService");
        service.doSome();
    }
    //环绕增强
    @Test
    public void test06(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContextestspringaopintecrptor03.xml");
        cn.happy.springmethodinterceptor1006aop_3.ISomeService service=(cn.happy.springmethodinterceptor1006aop_3.ISomeService)ctx.getBean("proxyService");
        service.doSome();
    }
    //后置增强
    @Test
    public void test05(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContextestspringaopafter02.xml");
        ISomeService service=(ISomeService)ctx.getBean("proxyService");
        service.doSome();
    }
    //前置增强
    @Test
    public void test04(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContexttestspringaop01.xml");
        SomeService service=(SomeService)ctx.getBean("proxyService");
        service.doSome();
    }


    //03.Cglib动态代理
    @Test
    public void test03(){
        final UserService service=new UserService();
        //Enhancer对象
        Enhancer enhancer=new Enhancer();
        //在内存中构建业务的子类
        enhancer.setSuperclass(service.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            /**
             *
             * @param o 代理对象
             * @param method  代理对象方法
             * @param objects  参数
             * @param methodProxy
             * @return
             * @throws Throwable
             */
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("before");
                method.invoke(service,objects);
                System.out.println("after");
                return null;
            }
        });
        UserService proxy=(UserService) enhancer.create();
        proxy.delte();

    }
    //02.JDK动态代理
    @Test
    public void test02(){
       final IUserDAO dao=new UserDAOImpl();

        IUserDAO proxy=(IUserDAO)Proxy.newProxyInstance(dao.getClass().getClassLoader(), dao.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("事务已经开启");
                method.invoke(dao,args);
                return null;
            }
        });
        //代理对象 add  eit
        proxy.add();
        proxy.edit();

    }

    //01.静态代理
    @Test
    public void test01(){
        //真实的主题对象
        Subject sub=new RealSubject();
        //代理对象
        ProxySubject proxySubject=new ProxySubject();
        proxySubject.setRealSubject(sub);
        proxySubject.add();

    }

}
