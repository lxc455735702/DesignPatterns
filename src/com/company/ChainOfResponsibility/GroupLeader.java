package com.company.ChainOfResponsibility;



/**
 * @Description: 组长可以直接审批小于等于一天的请假
 * @Author: lxc 672063
 * @CreateTime: 2021-05-21 12:25
 * @Email: 18867762063@163.com
 */
public class GroupLeader extends Handler {
    @Override
    public void handleRequest(int days) {
        if(days <= 1){
            System.out.println("小于等于1天，小组长直接审批");
        }else {
            if(next != null){
                next.handleRequest(days);
            }else {
                System.out.println("GroupLeader next error");
            }
        }
    }
}
