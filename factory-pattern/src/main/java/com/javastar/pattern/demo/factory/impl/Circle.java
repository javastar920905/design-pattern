package com.javastar.pattern.demo.factory.impl;

import com.javastar.pattern.demo.factory.Shape;

/**
 * Created by ouzhx on 2016/12/26.
 */
public class Circle implements Shape {
    public void draw() {
        System.out.println("inside Circle :draw method");
    }
}
