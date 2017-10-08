package cn.happy.spring1007_03;

/**
 * Created by LY on 2017/10/7.
 */
public class SomeService implements ISomeService {

    public void insert() {
        System.out.println("insert");
    }

    public String update() {
        System.out.println("update");
        return null;
    }

    public void delete() {
        System.out.println("delete");
    }

    public void select() {
        System.out.println("select");
    }
}
