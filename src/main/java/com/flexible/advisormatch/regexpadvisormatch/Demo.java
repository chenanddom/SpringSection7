package com.flexible.advisormatch.regexpadvisormatch;
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
        Waiter waiter = (Waiter) context.getBean("advisormatchWaiter2");
        Seller seller = (Seller) context.getBean("advisormatchSeller2");
        waiter.greetTo("zhangsan");
        waiter.serveTo("zhangsan");
        seller.greetTo("李四");
    }
}
