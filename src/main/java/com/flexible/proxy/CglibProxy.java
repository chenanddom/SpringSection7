package com.flexible.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-21
 * Time: 9:27
 */
public class CglibProxy implements MethodInterceptor {
    Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz) {
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
      PerformanceMonitor.begin(o.getClass().getName()+"."+method.getName());
        Object invoke = methodProxy.invokeSuper(o, objects);
        PerformanceMonitor.end();
        return invoke;
    }
}
