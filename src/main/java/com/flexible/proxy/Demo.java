package com.flexible.proxy;

import org.junit.Test;

import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-21
 * Time: 8:42
 */
public class Demo {

    public static void main(String[] args) {
        ForumService forumService = new ForumServiceImpl();
        forumService.removeForum(1);
        System.out.println("-------------------使用jdk动态代理------------------");
        JdkProxy jdkProxy = new JdkProxy(forumService);
        ForumService instance = (ForumService) Proxy.newProxyInstance(Demo.class.getClassLoader(), new Class[]{ForumService.class}, jdkProxy);
        instance.removeForum(1);
        System.out.println("-------------------使用CGLib动态代理------------------");
        CglibProxy cglibProxy = new CglibProxy();
        ForumServiceImpl forumService1 = (ForumServiceImpl)cglibProxy.getProxy(ForumServiceImpl.class);
        forumService1.removeForum(1);

    }
    @Test
    public void test(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();
        date.setTime(0);
        System.out.println(sdf.format(date));
        System.out.println(date.getTime());
    }
}
