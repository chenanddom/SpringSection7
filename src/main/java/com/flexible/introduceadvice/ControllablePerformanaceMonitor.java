package com.flexible.introduceadvice;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class ControllablePerformanaceMonitor extends DelegatingIntroductionInterceptor implements Monitorable{
    //
    private ThreadLocal<Boolean> monitorStatusMap = new ThreadLocal<>();
    @Override
    public void setMonitorActive(boolean active) {
        monitorStatusMap.set(active);
    }

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        Object obj = null;
//        对于支持性能监视可控代理，通过判断其状态觉得是否开启性能监控功能
        if (monitorStatusMap.get()!=null && monitorStatusMap.get()){
            PerformanceMonitor.begin(mi.getClass().getName()+"."+mi.getMethod());
            obj = super.invoke(mi);
            PerformanceMonitor.end();
        }else {

            obj=super.invoke(mi);
        }
        return obj;
    }
}
