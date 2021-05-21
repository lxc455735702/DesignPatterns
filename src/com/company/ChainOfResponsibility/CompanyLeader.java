package com.company.ChainOfResponsibility;

/**
 * @Description: 公司 可以直接审批小于等于5天的请假
 * @Author: lxc 672063
 * @CreateTime: 2021-05-21 12:26
 * @Email: 18867762063@163.com
 */
public class CompanyLeader extends Handler {
    @Override
    public void handleRequest(int days) {
        if(days <= 5){
            System.out.println("小于5天，公司直接审批");
        }else {
            if(next != null){
                next.handleRequest(days);
            }else {
                System.out.println("CompanyLeader next error");
            }
        }
    }
}
