package com.javastar920905.singleton;

/**
 * Created by ouzhx on 2017/11/4.
 * 最经典懒加载
 */
public class Singleton {
    /**
     * (利用静态内部类,jvm会在首次使用该类时加载)
     * private 保证不能被别人修改
     * static 保证全局唯一
     * <p>
     * jvm 类加载顺序: 从上到下,先属性后方法,先静态后动态(static 静态块会在该类首次使用时加载)
     */
    private static class LazyHolder {
        /**
         * final 为了防止内部读操作
         */
        private static final Singleton instance = new Singleton();
    }

    /**
     * 构造器私有化
     */
    private Singleton() {
    }

    /**
     * final 保证别人不能覆盖
     * 如果用户一直不用这个方法,这个实例空间是不会分配的
     * 只有首次调用才会分配空间
     */
    public static final Singleton getInstance() {
        return LazyHolder.instance;
    }
}
