package com.flexible.afteradvice;

import org.junit.Test;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-22
 * Time: 9:26
 */
public class Demo {

    @Test
    public void testMethod1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:proxyfactory/beans");
        Waiter waiter = (Waiter) context.getBean("waiter2");
        waiter.greetTo("zhangsgan ");
        waiter.serveTo("李四");
    }

}
