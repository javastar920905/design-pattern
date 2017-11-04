package com.javastar920905.singleton;

/**
 * Created by ouzhx on 2017/11/4.
 * 懒加载方式
 */
public class LazyClassic {
    private static LazyClassic classsic;

    /**
     * 1 构造器私有
     */
    private LazyClassic() {

    }

    public static final LazyClassic getInstance() {
        if (classsic == null) {
            synchronized (classsic) {
                if (classsic == null) {
                    classsic = new LazyClassic();
                }
            }
        }
        return classsic;
    }


}
