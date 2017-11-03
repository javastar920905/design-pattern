package com.javastar920905.jdk;

/**
 * Created by ouzhx on 2017/11/3.
 * 欧欧,单身, 叫媒婆代理找对象
 */
public class Ouou implements Person {
    private String sex = "男";
    private String name = "欧欧";

    @Override public void findLove() {
        System.out.println("我叫:"+name+"  性别: "+sex +" 我找对象要求: ");
        System.out.println("白富美");
        System.out.println("温柔体贴");
        System.out.println("善解人意");
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
