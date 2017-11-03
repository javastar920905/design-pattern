package com.javastar920905.proxy.jdk.custom;

import com.javastar920905.proxy.jdk.Person;

import java.lang.reflect.Method;

/**
 * Created by ouzhx on 2017/11/3.
 */
public class MeiPo2 implements CustomInvotationHandler {
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
        System.out.println("被代理的对象是:" + clazz);
        return CustomProxy.newProxyInstance(new CustomClassLoader(), clazz.getInterfaces(), this);
        // return null;
    }


    @Override public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("媒婆帮忙找对象啦!符合条件的可以来(⊙o⊙)哦 ,客户要求如下:");
        //不需要自己调用,使用反射api调用  this.target.findLove();
        method.invoke(this.target, args);
        System.out.println("如果合适的话,就成了!");
        return null;
    }
}
