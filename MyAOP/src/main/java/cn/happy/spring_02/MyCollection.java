package cn.happy.spring_02;

import java.util.*;

/**
 * Created by LY on 2017/10/7.
 */
public class MyCollection {
    private String[] array;
    private List<String> list;
    private Set<String> set;
    private Map<String,Object> map;
    private Properties properties;

    public MyCollection() {
        System.out.println("============");
    }

    @Override
    public String toString() {
        return "MyCollection{" +
                "array=" + Arrays.toString(array) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
