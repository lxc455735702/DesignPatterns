package com.company.ChainOfResponsibility;

/**
 * @Description: 抽象处理 handler
 * @Author: lxc 672063
 * @CreateTime: 2021-05-21 12:20
 * @Email: 18867762063@163.com
 */
public abstract class Handler {
    protected  Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    // 处理请求
    public abstract void handleRequest(int days);
}
