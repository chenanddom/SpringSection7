package com.flexible.advisormatch.composablepointcutmatch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-28
 * Time: 9:50
 */
public class Demo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:proxyfactory/beans");
        Waiter waiter = (Waiter) context.getBean("composableProxyWaiter");
        WaiterDelegate delegate = new WaiterDelegate();
        delegate.setWaiter(waiter);
        waiter.serveTo("zhansagn");
        waiter.greetTo("zhangsan");
        delegate.service("zhangsgan");
    }
}
