package com.xupengboo.饿汉式;

/**
 * @author: xupengboo
 * @date: 2024/1/24 16:14
 * @description: 饿汉式
 */
@SuppressWarnings("InstantiationOfUtilityClass")
public class Singleton {

    // 保持一个静态实例变量
    private static Singleton instance = new Singleton();

    // 私有构造方法，防止外部实例化
    private Singleton(){
        // 防止通过反射实例化
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    /**
     *  这种方式比较常用，天然的线程安全，但容易产生垃圾对象，浪费内存（没有锁效率自然高，但是，类加载时就要初始化，浪费内存）。
     *  它基于 classloader 机制避免了多线程的同步问题，但是，显然没有达到 lazy loading 的效果。
     */
    public static Singleton getInstance() {
        return instance;
    }

}
