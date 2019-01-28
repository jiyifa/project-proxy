package com.jiyifa.factory.delegate;

public class ExecutorB implements IExector{

    @Override
    public void doing() {
        System.out.println("员工B开始执行任务");
    }
}
