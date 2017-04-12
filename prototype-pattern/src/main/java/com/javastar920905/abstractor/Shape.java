package com.javastar920905.abstractor;

/**
 * Created by ouzhx on 2016/12/27.
 */
public abstract class Shape implements Cloneable {
  private String id;
  protected String type;

  abstract void draw();

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Object clone() {
    Object object = null;
    try {
      object = super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return object;
  }
}
