package com.codingfuture;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cpac = new ClassPathXmlApplicationContext("spring1.xml");
        //City city = (City) cpac.getBean("city2");
//        city.test();
        //System.out.println(city.getName());
//        City city2 = (City) classPathXmlApplicationContext.getBean("city2");
//        city2.test();
//        City city3 = (City) classPathXmlApplicationContext.getBean("city3");
//        city3.test();
        //Person person = (Person)cpac.getBean("person");
        //System.out.println(person.getCity().getName());
        //Person person = (Person)cpac.getBean("person1");
        //System.out.println(person.getMap().get("name"));
        Object bean = cpac.getBean("person");
    }
}
