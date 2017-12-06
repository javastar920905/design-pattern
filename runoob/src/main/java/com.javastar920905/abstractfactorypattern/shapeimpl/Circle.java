package com.javastar920905.abstractfactorypattern.shapeimpl;



import com.javastar920905.abstractfactorypattern.Shape;

/**
 * Created by ouzhx on 2016/12/26.
 */
public class Circle implements Shape {
    public void draw() {
        System.out.println("inside Circle :draw method");
    }
}
