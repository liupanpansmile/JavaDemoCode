package com.oneapm.aop.methodbeforeadvice;


import com.oneapm.autowire.Master;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.ObjectError;

import java.lang.reflect.Method;


/**
 * Created by Administrator on 2016/3/30.
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/oneapm/aop/methodbeforeadvice/beans.xml") ;
        ISerivce service = (ISerivce)context.getBean("proxyFactoryBean") ;
        System.out.println(service.getServiceName() );
        System.out.println("***********************");
        service.dataStore("metric_data");

    }
}
