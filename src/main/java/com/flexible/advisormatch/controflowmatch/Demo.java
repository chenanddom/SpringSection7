package com.flexible.advisormatch.controflowmatch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-28
 * Time: 8:56
 */
public class Demo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:proxyfactory/beans");
        Waiter waiter = (Waiter) context.getBean("controlFlowWaiter1");
        WaiterDelegate delegate = new WaiterDelegate();
        delegate.setWaiter(waiter);
        waiter.greetTo("zhangsan");
        waiter.serveTo("zhangsan");
        delegate.service("zhangsan");
    }
}
