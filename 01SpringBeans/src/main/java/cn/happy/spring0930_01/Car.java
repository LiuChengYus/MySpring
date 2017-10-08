
package cn.happy.spring0930_01;

/**
 * Created by LY on 2017/9/30.
 */
public class Car {
    private String blank;
    private String color;

    @Override
    public String toString() {
        return "Car{" +
                "blank='" + blank + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Car(){

    }
    public Car(String blank, String color) {
        this.blank = blank;
        this.color = color;
    }

    public String getBlank() {
        return blank;
    }

    public void setBlank(String blank) {
        this.blank = blank;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
