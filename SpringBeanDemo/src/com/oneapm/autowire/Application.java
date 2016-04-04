package com.oneapm.autowire;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Created by Administrator on 2016/3/30.
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/oneapm/autowire/beans.xml") ;
        Master master = (Master) context.getBean("master") ;

        System.out.println(master.getName() +"  " + master.getD().getName()) ;


    }

}
