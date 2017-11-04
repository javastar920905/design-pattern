package com.javastar920905.delegate;

/**
 * Created by ouzhx on 2017/11/4.
 * 这个是项目经理角色,工作职责不一样,工作就是负责分配任务
 */
public class Dispatcher implements IExecutor {
    IExecutor executor;

    Dispatcher(IExecutor executor) {
        this.executor = executor;
    }

    /**
     * 执行任务
     * 在公司中员工执行任务是有规章制度和流程的
     **/
    @Override public void doing() {
        this.executor.doing();
    }
}
