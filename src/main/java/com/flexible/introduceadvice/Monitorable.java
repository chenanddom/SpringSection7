package com.flexible.introduceadvice;

public interface Monitorable {
//    通过该接口来控制业务类性能监视功能的激活和关闭状态
    void setMonitorActive(boolean active);
}
