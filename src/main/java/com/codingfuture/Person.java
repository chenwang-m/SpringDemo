package com.codingfuture;

import org.springframework.stereotype.Component;

import java.util.Map;
@Component(value = "person")
public class Person {
    private String sex;
    private String name;
    private City city;
    private Map<String,String> map;

    public Person() {
        System.out.println("无参构造");
    }

    public Person(String sex, String name, City city, Map<String, String> map) {
        this.sex = sex;
        this.name = name;
        this.city = city;
        this.map = map;
        System.out.println("有参构造");
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

}
