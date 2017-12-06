package com.javastar920905.abstractfactorypattern.colorimpl;


import com.javastar920905.abstractfactorypattern.Color;

/**
 * Created by ouzhx on 2016/12/26.
 */
public class Red implements Color {
    @Override
    public void color() {
        System.out.println("fill red color");
    }
}
