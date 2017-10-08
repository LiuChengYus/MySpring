package cn.happy.springthrow1006_04;

/**
 * Created by LY on 2017/10/6.
 */
public class SomeService implements ISomeService {
    //核心业务
    public void doSome(){
        int num=5/0;
        System.out.println("我们都要好好的");
    }
}
