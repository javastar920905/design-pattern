package com.javastar920905.delegate;

/**
 * Created by ouzhx on 2017/11/4.
 */
public class EmployerB implements IExecutor {
    /**
     * 普通员工执行任务
     * 在公司中员工执行任务是有规章制度和流程的
     **/
    @Override public void doing() {
        System.out.println("员工B 开始执行任务");
    }
}
