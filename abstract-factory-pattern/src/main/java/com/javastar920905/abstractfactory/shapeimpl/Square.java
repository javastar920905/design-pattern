package com.javastar920905.abstractfactory.shapeimpl;


import com.javastar920905.abstractfactory.Shape;

/**
 * Created by ouzhx on 2016/12/26.
 */
public class Square implements Shape {
  public void draw() {
    System.out.println("inside Square :draw() method ");
  }
}
