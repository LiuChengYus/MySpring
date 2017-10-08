package cn.happy.spring1006aopadvisor_08;

/**
 * Created by LY on 2017/10/6.
 */
public class SomeService implements ISomeService {
    //核心业务
    public void doSome(){
        System.out.println("doSome");
    }

    public void add() {
        System.out.println("add");
    }
}
