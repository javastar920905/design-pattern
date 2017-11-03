package com.javastar920905.proxy.jdk.custom;

import java.lang.reflect.Method;

/**
 * Created by ouzhx on 2017/11/3.
 *
 */
public interface CustomInvotationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
