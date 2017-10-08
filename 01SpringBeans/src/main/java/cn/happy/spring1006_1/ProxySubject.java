package cn.happy.spring1006_1;

/**
 * Created by LY on 2017/10/6.
 */
public class ProxySubject implements  Subject{
    private Subject realSubject;
    public String add() {
        System.out.println("事务已经开启");

        return realSubject.add();
    }

    public Subject getRealSubject() {
        return realSubject;
    }

    public void setRealSubject(Subject realSubject) {
        this.realSubject = realSubject;
    }
}
