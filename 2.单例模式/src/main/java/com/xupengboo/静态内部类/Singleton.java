package com.xupengboo.静态内部类;

/**
 * @author: xupengboo
 * @date: 2024/1/24 16:44
 * @description: 登记式/静态内部类 方式
 */
@SuppressWarnings("InstantiationOfUtilityClass")
public class Singleton {

    // 私有构造方法，防止外部实例化
    private Singleton() {

    }

    /**
     *  登记式/静态内部类方式原理：利用静态内部类的特性，在内部类被加载和初始化时创建单例对象，通过JVM保证了线程安全性。
     *  即能够保证懒加载，又能够在多线程环境中保持线程安全，而不需要使用synchronized关键字。
     */
    private static class SingletonHolder {
        public static final Singleton INSTANCE = new Singleton();
    }

    // 全局访问点，用于获取单例实例
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
