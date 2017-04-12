package com.javastar920905.abstractfactory.shapeimpl;


import com.javastar920905.abstractfactory.Shape;

/**
 * Created by ouzhx on 2016/12/26.
 */
public class Circle implements Shape {
    public void draw() {
        System.out.println("inside Circle :draw method");
    }
}
