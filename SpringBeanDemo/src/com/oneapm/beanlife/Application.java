package com.oneapm.beanlife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/3/29.
 */
public class Application {
    public static void main(String[] args) {

        //ApplicationContext
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/oneapm/beanlife/beans.xml") ;
        PersonService personService = (PersonService)applicationContext.getBean("personService") ;
        //System.out.println(personService.getName());


    }
}
