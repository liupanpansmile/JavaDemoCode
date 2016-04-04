package com.oneapm.dispatch;

import com.oneapm.collection.Department;
import com.oneapm.collection.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * Created by Administrator on 2016/3/30.
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/oneapm/dispatch/beans.xml") ;
        DBUtil dbUtil = (DBUtil) context.getBean("dbUtil") ;
        DBUtil dbUtil2 = (DBUtil) context.getBean("dbUtil2") ;
        System.out.println(dbUtil.getDirver());
        System.out.println(dbUtil.getUrl());

        System.out.println(dbUtil2.getDirver());
        System.out.println(dbUtil2.getUrl());
    }

}
