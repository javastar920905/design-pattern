package com.javastar920905.proxy.jdk;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * Created by ouzhx on 2017/11/3.
 * 不找中介
 */
public class TestFindLoveWithProxy {
    public static void main(String[] args) {
        Person proxyObj = (Person) new MeiPo().getInstance(new Ouou());
        System.out.println("代理对象类型: " + proxyObj.getClass());
        proxyObj.findLove();


        //从内存中反编译字节码
        byte[] data = ProxyGenerator.generateProxyClass("$Proxy0", new Class[] {Person.class});

        //写出到文件,然后使用反编译工具(或者idea)查看$Proxy0.class
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D://$Proxy0.class");
            fileOutputStream.write(data);
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
