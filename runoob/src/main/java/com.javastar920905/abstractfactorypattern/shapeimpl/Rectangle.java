package com.javastar920905.abstractfactorypattern.shapeimpl;



import com.javastar920905.abstractfactorypattern.Shape;

/**
 * Created by ouzhx on 2016/12/26.
 */
public class Rectangle implements Shape {
    public void draw() {
        System.out.println("Inside Rectangle : draw() method");
    }
}
