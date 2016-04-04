package com.oneapm.aop.methodbeforeadvice;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/4/2.
 */
public class MyThorwsAdvice implements ThrowsAdvice {
    public void afterThrowing(Method method, Object[] args, Object target, Exception ex){
        System.out.println("出事了 " + ex.getMessage());
    }
}
