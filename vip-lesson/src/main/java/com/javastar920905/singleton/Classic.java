package com.javastar920905.singleton;

/**
 * Created by ouzhx on 2017/11/4.
 * 立即加载方式
 */
public class Classic {

    private static Classic classsic = new Classic();

    /**
     * 1 构造器私有
     */
    private Classic() {

    }


    public static final Classic getInstance() {
        return classsic;
    }


}
