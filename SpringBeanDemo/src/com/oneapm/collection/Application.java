package com.oneapm.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * Created by Administrator on 2016/3/30.
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/oneapm/collection/beans.xml") ;
        Department department = (Department) context.getBean("department") ;
        System.out.println(department.getName());
        for (String empName :department.getEmpNames()){
            System.out.println(empName);
        }

        for(Employee emp: department.getEmpList()){
            System.out.println(emp);
        }

        for(Employee emp: department.getEmpSet()){
            System.out.println(emp);
        }

        for(Map.Entry<String,Employee> entry: department.getEmpMap().entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

}
