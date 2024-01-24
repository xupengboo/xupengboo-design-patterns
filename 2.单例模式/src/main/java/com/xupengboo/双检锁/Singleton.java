package com.xupengboo.双检锁;

/**
 * @author: xupengboo
 * @date: 2024/1/24 16:26
 * @description: 双检索
 */
@SuppressWarnings("InstantiationOfUtilityClass")
public class Singleton {

    /**
     * 使用 volatile 修饰符保证了多线程环境下的可见性。当线程A进入synchronized块并实例化了Singleton对象后，线程B在第一次检查时能够看到实例
     * 已经被创建，直接返回实例，而不再进入synchronized块。这就避免了多个线程在同一时刻进入synchronized块，提高了性能。
     */
    private static volatile Singleton instance;

    // 私有构造方法，防止外部实例化
    private Singleton(){
        // 防止通过反射实例化
        if (instance == null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    /**
     * 使用 `volatile + 双重校验` ，即实现了懒加载的效果，又保证了线程安全，也能满足高性能。
     */
    public static Singleton getInstance() {
        // 第一次检查
        if (instance == null) {
            synchronized (Singleton.class) {
                // 第二次检查
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
