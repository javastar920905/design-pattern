package com.javastar920905.prototype.greatestsage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * �����ʥ
 * 
 * @author Tom
 *
 */
public class TheGreatestSage extends Monkey implements Cloneable, Serializable {

  // �𹿰�
  private GoldRingedStaff staff;

  // ��ʯͷ����ĳ���
  public TheGreatestSage() {
    this.staff = new GoldRingedStaff();
    this.birthday = new Date();
    this.height = 150;
    this.weight = 30;
    System.out.println("------------------------");
  }

  // ������
  @Override
  public Object clone() {
    // ��ȿ�¡
    ByteArrayOutputStream bos = null;
    ObjectOutputStream oos = null;
    ByteArrayInputStream bis = null;
    ObjectInputStream ois = null;
    try {
      // return super.clone();//Ĭ��ǳ��¡��ֻ��¡�˴�����������ͺ�String
      // ���л�
      bos = new ByteArrayOutputStream();
      oos = new ObjectOutputStream(bos);
      oos.writeObject(this);

      // �����л�
      bis = new ByteArrayInputStream(bos.toByteArray());
      ois = new ObjectInputStream(bis);
      TheGreatestSage copy = (TheGreatestSage) ois.readObject();
      copy.birthday = new Date();

      return copy;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    } finally {
      try {
        bos.close();
        oos.close();
        bis.close();
        ois.close();

      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  // �仯
  public void change() {
    TheGreatestSage copySage = (TheGreatestSage) clone();
    System.out.println("��ʥ���������ǣ�" + this.getBirthday().getTime());
    System.out.println("��¡��ʥ��������:" + copySage.getBirthday().getTime());
    System.out.println("��ʥ����Ϳ�¡��ʥ�Ƿ�Ϊͬһ������:" + (this == copySage));
    System.out.println(
        "��ʥ������еĽ𹿰�����¡��ʥ���н𹿰��Ƿ�Ϊͬһ������:" + (this.getStaff() == copySage.getStaff()));
  }

  public GoldRingedStaff getStaff() {
    return staff;
  }

  public void setStaff(GoldRingedStaff staff) {
    this.staff = staff;
  }



}
