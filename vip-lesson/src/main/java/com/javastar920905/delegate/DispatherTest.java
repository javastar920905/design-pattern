package com.javastar920905.delegate;

/**
 * Created by ouzhx on 2017/11/4.
 */
public class DispatherTest {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher(new EmployerA());
        //看上去好像是项目经理在干活,但实际干活的是普通员工
        //典型的 干活是我的功劳是你的!
        dispatcher.doing();
    }
}
