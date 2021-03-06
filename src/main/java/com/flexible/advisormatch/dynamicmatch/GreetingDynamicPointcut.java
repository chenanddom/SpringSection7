package com.flexible.advisormatch.dynamicmatch;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-27
 * Time: 11:14
 */
public class GreetingDynamicPointcut extends DynamicMethodMatcherPointcut {
    private static List<String> specialClientList = new ArrayList<>();

    static {
        specialClientList.add("John");
        specialClientList.add("Tom");
    }

    //    对类进行静态切点检查
    @Override
    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            @Override
            public boolean matches(Class<?> clazz) {
                System.out.println("调用getClassFilter()对" + clazz.getName() + "做静态检查.");
                return Waiter.class.isAssignableFrom(clazz);
            }
        };
    }

    //    对方法进行静态切点检测
    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        return super.matches(method, targetClass);
    }

    // 对方法进行动态切点检测
    @Override
    public boolean matches(Method method, Class<?> targetClass, Object... args) {
        System.out.println("调用matches(Method method, Class<?> targetClass, Object... args)"
                + targetClass.getName() + "." + method.getName()+"做动态检测");
        String clientName = (String) args[0];
        return specialClientList.contains(clientName);
    }
}
