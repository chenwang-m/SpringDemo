package com.codingfuture;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        City city = (City) classPathXmlApplicationContext.getBean("city2");
//        city.test();
        System.out.println(city.getName());
//        City city2 = (City) classPathXmlApplicationContext.getBean("city2");
//        city2.test();
//        City city3 = (City) classPathXmlApplicationContext.getBean("city3");
//        city3.test();

    }
}
