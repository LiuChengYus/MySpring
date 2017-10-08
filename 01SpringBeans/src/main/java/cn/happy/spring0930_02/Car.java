package cn.happy.spring0930_02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by LY on 2017/9/30.
 */
@Component()
public class Car {
    @Value("兰博基尼 ")
    private String blank;
    @Value("蓝色")
    private String color;

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

    @Override
    public String toString() {
        return "Car{" +
                "blank='" + blank + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
