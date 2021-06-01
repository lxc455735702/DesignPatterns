package com.company.ChainOfResponsibility;

/**
 * @Description: 责任链测试
 * @Author: lxc 672063
 * @CreateTime: 2021-05-21 12:35
 * @Email: 18867762063@163.com
 */
public class Test {

    public static void main(String[] args){
       //  System.out.println("测试！！！");
        GroupLeader groupLeader = new GroupLeader();
        TeamLeader teamLeader = new TeamLeader();
        CompanyLeader companyLeader = new CompanyLeader();
        groupLeader.setNext(teamLeader);
        teamLeader.setNext(companyLeader);
        Handler handler = groupLeader;

        handler.handleRequest(1);
        handler.handleRequest(3);
        handler.handleRequest(4);
        handler.handleRequest(8);
    }
}
