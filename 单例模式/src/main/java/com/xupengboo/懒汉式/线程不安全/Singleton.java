package com.xupengboo.懒汉式.线程不安全;

/**
 * @author: xupengboo
 * @date: 2024/1/24 16:05
 * @description: 懒汉式，线程不安全
 */
@SuppressWarnings("InstantiationOfUtilityClass")
public class Singleton {

    // 保持一个静态实例变量
    public static Singleton instance;

    // 私有构造方法，防止外部实例化
    private Singleton(){
        // 防止通过反射实例化
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    /**
     *  懒汉式，线程不安全，不支持多线程！
     *   这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
