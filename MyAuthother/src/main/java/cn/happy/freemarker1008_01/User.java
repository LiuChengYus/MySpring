package cn.happy.freemarker1008_01;

/**
 * Created by LY on 2017/10/8.
 */
public class User {
    private String name;
    private Integer age;
    public User(){

    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
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
