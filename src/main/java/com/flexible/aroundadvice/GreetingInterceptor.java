package com.flexible.aroundadvice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class GreetingInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object[] args =methodInvocation.getArguments();
        String clientNme = (String) args[0];
        System.out.println("How are you Mr."+clientNme+"....");
        Object proceed = methodInvocation.proceed();
        System.out.println("Please enjoy yourself....");
        return proceed;
    }
}
