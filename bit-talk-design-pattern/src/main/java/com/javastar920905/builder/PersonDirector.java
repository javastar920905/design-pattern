package com.javastar920905.builder;

import javax.swing.*;

/**
 * Created by ouzhx on 2017/12/5. 指挥者(使用builder 接口的对象)
 */
public class PersonDirector {
  private PersonBuilder personBuilder;

  /**
   * 用户告诉指挥者 需要创造什么要的小人
   * 
   * @param personBuilder
   */
  public PersonDirector(PersonBuilder personBuilder) {
    this.personBuilder = personBuilder;
  }

  /**
   * 流程规范化造人 避免缺胳膊少腿
   */
  public void createPerson() {
    personBuilder.buildHead();
    personBuilder.buildBody();
    personBuilder.buildArmLeft();
    personBuilder.buildArmRight();
    personBuilder.buildLegLeft();
    personBuilder.buildLegRight();
  }

  /**
   * 实现生产流程化
   * 
   * @param args
   */
  public static void main(String[] args) {
    PersonDirector director;
    // 创建一个瘦子
    director = new PersonDirector(new ThinPersonBuilder(new DebugGraphics()));
    director.createPerson();
    // 创建一个胖子
    System.out.println("==================>");
    director = new PersonDirector(new FatPersonBuilder(new DebugGraphics()));
    director.createPerson();


  }
}
