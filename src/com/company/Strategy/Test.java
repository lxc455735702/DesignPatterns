package com.company.Strategy;

/**
 * @Description: 策略模式测试类
 * @Author: lxc 672063
 * @CreateTime: 2021-06-01 14:25
 * @Email: 18867762063@163.com
 */
public class Test {

    public static void main(String[] args){
            Calculation calculation = new Calculation(); // 一次计算
            calculation.setSortMode(new QuickSort()); // 使用快速排序去解
            calculation.getResult(); // 获取结果
            calculation.setSortMode(new SimpleSort()); // 突然又想换成简单排序算法去看看结果
            calculation.getResult(); // 获取结果
    }
}
