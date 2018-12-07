package com.flexible.autoprxycreator.beannameautoproxycreator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-12-06
 * Time: 9:09
 */
public class Demo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:autoproxycreator/beans");
        Waiter waiter = (Waiter) context.getBean("autoWaiter");
        Seller seller = (Seller) context.getBean("autoSeller");
        waiter.greetTo("John");
        seller.greetTo("Tom");
    }
}
