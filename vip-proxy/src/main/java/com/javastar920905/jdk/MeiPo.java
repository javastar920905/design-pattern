package com.javastar920905.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by ouzhx on 2017/11/3.
 * jdk的动态代理 需要实现接口 java.lang.reflect.InvocationHandler
 */
public class MeiPo implements InvocationHandler {
    /**
     * 保存被代理对象的引用
     */
    private Person target;

    /**
     * 获取被代理人的个人资料,并产生一个代理对象(媒婆)
     **/
    public Object getInstance(Person target) {
        this.target = target;
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }


    @Override public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("媒婆帮忙找对象啦!符合条件的可以来(⊙o⊙)哦 ,客户要求如下:");
        this.target.findLove();
        System.out.println("如果合适的话,就成了!");
        return null;
    }
}
