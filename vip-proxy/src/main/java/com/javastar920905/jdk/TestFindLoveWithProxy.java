package com.javastar920905.jdk;

/**
 * Created by ouzhx on 2017/11/3.
 * 不找中介
 */
public class TestFindLoveWithProxy {
    public static void main(String[] args) {
        Person proxyObj = (Person) new MeiPo().getInstance(new Ouou());
        //System.out.println(proxyObj);
        proxyObj.findLove();
    }
}
