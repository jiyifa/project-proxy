package com.jiyifa.factory.delegate;

//想法，用代码来描述想法
public class ExecutorA implements IExector {
    @Override
    public void doing() {
        System.out.println("员工A开始执行任务");
    }
}
