package com.flexible.introduceadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-12-03
 * Time: 8:42
 */
public class Demo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:proxyfactory/beans");


        ForumService forumService = (ForumService) context.getBean("forumService");
        forumService.removeForum(10);
        forumService.removeTopic(20);

        Monitorable forumService1 = (Monitorable) forumService;
        forumService1.setMonitorActive(true);

        forumService.removeForum(10);
        forumService.removeTopic(20);
    }
}
