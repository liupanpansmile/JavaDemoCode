package com.oneapm.aop.methodbeforeadvice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/4/1.
 */
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("记录日志 target:" + o.getClass().getName() + " method name:" + method.getName());
    }
}
