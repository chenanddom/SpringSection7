package com.flexible.autoprxycreator.defaultautoproxycreator;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-12-06
 * Time: 9:38
 */
public class Demo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:autoproxycreator/beans");
        Waiter waiter = (Waiter) context.getBean("autoWaiter2");
        Seller seller = (Seller) context.getBean("autoSeller2");
        waiter.greetTo("John");
        seller.greetTo("Tom");
    }
}
