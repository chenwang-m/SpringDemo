package com.codingfuture;

public class City {
    private String name;
    public City(){

    }
    public City(String name) {
        this.name = name;
    }

   /* public City() {
    }*/

    /*public City(String s) {
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void test(){
        System.out.println("通过Spring IoC获取对象");
    }
}
