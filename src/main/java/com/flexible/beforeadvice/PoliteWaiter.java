package com.flexible.beforeadvice;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-22
 * Time: 9:22
 */
public class PoliteWaiter implements Waiter {
    @Override
    public void greetTo(String name) {
        System.out.println("greet to "+name+"....");
    }

    @Override
    public void serveTo(String name) {
        System.out.println("serve to "+name+"....");

    }
}
