package com.oneapm.constructor;

import com.oneapm.collection.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/3/31.
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/oneapm/constructor/beans.xml") ;
        Employee emp1 = (Employee) context.getBean("emp1") ;

        System.out.println(emp1.getName());
        System.out.println(emp1.getId());
    }

}
