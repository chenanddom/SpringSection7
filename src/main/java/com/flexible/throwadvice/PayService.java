package com.flexible.throwadvice;

/**
 * 模拟业务的类，支付的时候抛出异常
 */
public class PayService {

    public void payMony(String from, double money, String to) {
    //TODO -- TODO some thing
        throw new RuntimeException("测试抛出运行时异常....");
    }
}
