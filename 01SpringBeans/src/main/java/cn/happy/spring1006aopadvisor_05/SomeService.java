package cn.happy.spring1006aopadvisor_05;

/**
 * Created by LY on 2017/10/6.
 */
public class SomeService implements ISomeService {
    //核心业务
    public void doSome(){
        System.out.println("我们都要好好的");
    }

    public void doSecond() {
        System.out.println("doSecond");
    }
}
