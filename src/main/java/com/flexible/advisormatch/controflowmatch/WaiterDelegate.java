package com.flexible.advisormatch.controflowmatch;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-28
 * Time: 8:58
 */
public class WaiterDelegate {

    private Waiter waiter;

    /**
     * 该方法发起调用的其他方法都织入GreetBeforeAdvice增强，
     * 要完成该功能就需要使用到流程切面。
     *
     * @param clientName
     */
    public void service(String clientName) {
        waiter.greetTo("service" + clientName);
        waiter.serveTo("service" + clientName);
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }
}
