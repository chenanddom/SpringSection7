package com.flexible.beforeadvice;

import org.junit.Test;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-22
 * Time: 9:26
 */
public class Demo {

    public static void main(String[] args) {
        Waiter target = new PoliteWaiter();
        BeforeAdvice advice = new GreetBeforeAdvice();
        //Spring提供的代理工厂
        ProxyFactory proxyFactory = new ProxyFactory();
        //设置代理目标
        proxyFactory.setTarget(target);
        //使用的jdk代理的方式
//        proxyFactory.setInterfaces(target.getClass().getInterfaces());
        //使用CGLib代理的方式
        proxyFactory.setOptimize(true);
        proxyFactory.addAdvice(advice);
        Waiter proxy = (Waiter) proxyFactory.getProxy();
        proxy.greetTo("John");
        proxy.serveTo("jack");

    }
    @Test
    public void testMethod1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:proxyfactory/beans");
        Waiter waiter = (Waiter) context.getBean("waiter");
        waiter.greetTo("zhangsgan ");
        waiter.serveTo("李四");
    }

}
