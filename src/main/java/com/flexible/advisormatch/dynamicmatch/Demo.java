package com.flexible.advisormatch.dynamicmatch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-27
 * Time: 8:53
 */
public class Demo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:proxyfactory/beans");
        Waiter waiter = (Waiter) context.getBean("waiter4");
        waiter.greetTo("John");
        waiter.greetTo("John");
        waiter.serveTo("zhangsan");
        waiter.serveTo("zhangsan");
    }
}
