package cn.happy.spring_03;

/**
 * Created by LY on 2017/10/7.
 */
public class Car {
    private String blank;

    @Override
    public String toString() {
        return "Car{" +
                "blank='" + blank + '\'' +
                '}';
    }

    public String getBlank() {
        return blank;
    }

    public void setBlank(String blank) {
        this.blank = blank;
    }
}
