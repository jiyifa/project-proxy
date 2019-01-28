package com.jiyifa.factory.delegate;

public class DispatcherTest {
    public static void main(String[] args) {
        Dispatcher ds  = new Dispatcher(new ExecutorA());
        //看上去好像是我们的项目经理在干活
        //但实际干活的人是普通员工
        ds.doing();
    }
}
