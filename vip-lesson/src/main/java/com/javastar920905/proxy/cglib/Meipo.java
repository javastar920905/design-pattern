package com.javastar920905.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * Created by Administrator on 2017/11/3. 需要添加cglib 依赖
 * http://mvnrepository.com/artifact/cglib/cglib/2.2.2
 */
public class Meipo implements MethodInterceptor {
  /**
   * 获取被代理人的个人资料,并产生一个代理对象(媒婆)
   **/
  public Object getInstance(Class clazz) {
    // 通过反射实例化,也可以直接传入目标对象
    Enhancer enhancer = new Enhancer();
    // 把父类设置为谁
    enhancer.setSuperclass(clazz);
    //设置回调对象...
    enhancer.setCallback(this);
    System.out.println("被代理的对象是:" + clazz);

    //1 生成源代码,编译,加载到jvm并返回代理对象
    return enhancer.create();
  }

  @Override
  /* //同样是做了字节码重组的事情 自动生成目标对象的子类,相对于jdk方式可以少些一个接口 */
  public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy)
      throws Throwable {
    System.out.println("cglib 媒婆帮忙找对象啦!符合条件的可以来(⊙o⊙)哦 ,客户要求如下:");
    // 这里一定要调用 invokeSuper(); 否则死循环
    // cglib的代理是通过生成一个被代理对象的子类,重写父类的方法
    // 生成后的对象是可以强制转换为被代理对象
    // new 子类前,必须new 出来父类,子类间接持有了父类的引用,子类重写了父类所有方法
    methodProxy.invokeSuper(o, args);
    System.out.println("如果合适的话,就成了!");

    return null;
  }
}

