package com.oneapm.beanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Administrator on 2016/3/29.
 */
public class PersonService implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,DisposableBean{
    private String name ;

    public PersonService(){
        System.out.println("PersonService Default Constructor");
    }



    public PersonService(String name){
        this.name = name ;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("PersonService setName Method");
        this.name = name;
    }

    @Override
    public void setBeanName(String s) {
        //System.out.println("bean name is " + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        //System.out.println("setBeanFactory " + beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        //System.out.println("setApplicationContext " + applicationContext);
    }

    @PostConstruct
    public void init(){
        System.out.println("init");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy");
    }
}
