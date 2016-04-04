package com.oneapm.aop.methodbeforeadvice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


/**
 * Created by Administrator on 2016/4/2.
 * 环绕通知
 */
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("环绕通知前");
        Object obj =  methodInvocation.proceed();
        System.out.println("环绕通知后");
        return obj;
    }
}
