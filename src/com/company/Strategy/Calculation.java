package com.company.Strategy;

/**
 * @Description: 计算
 * @Author: lxc 672063
 * @CreateTime: 2021-06-01 14:29
 * @Email: 18867762063@163.com
 */
public class Calculation {

    SortMode sortMode;

    public SortMode getSortMode() {
        return sortMode;
    }

    public void setSortMode(SortMode sortMode) {
        this.sortMode = sortMode;
    }

    public void getResult(){
        if(sortMode != null){
            sortMode.sort();
        }
    }
}
