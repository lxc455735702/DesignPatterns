package com.company.ChainOfResponsibility;

/**
 * @Description: 团队 可以直接审批小于等于3天的请假
 * @Author: lxc 672063
 * @CreateTime: 2021-05-21 12:26
 * @Email: 18867762063@163.com
 */
public class TeamLeader extends Handler {

    @Override
    public void handleRequest(int days) {
        if(days <= 3){
            System.out.println("小于3天，组长直接审批");
        }else {
            if(next != null){
                next.handleRequest(days);
            }else {
                System.out.println("TeamLeader next error");
            }
        }
    }

}
