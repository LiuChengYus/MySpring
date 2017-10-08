package cn.happy.spring0930.entity;

/**
 * Created by LY on 2017/9/30.
 */
public class User {
    private String name;
    private Integer age;

    public User(){
        System.out.println("================cc=============");
    }
    public User(String name,Integer age){
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
