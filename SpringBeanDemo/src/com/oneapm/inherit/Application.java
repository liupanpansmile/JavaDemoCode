package com.oneapm.inherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

/**
 * Created by Administrator on 2016/3/30.
 */
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/oneapm/inherit/beans.xml") ;
        Graduate graduate = (Graduate) context.getBean("graduate") ;

        System.out.println(graduate.getName());
        System.out.println(graduate.getAge());
        System.out.println(graduate.getDegree());


    }
}
