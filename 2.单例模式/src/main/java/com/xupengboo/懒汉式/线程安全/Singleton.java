package com.xupengboo.懒汉式.线程安全;

/**
 * @author: xupengboo
 * @date: 2024/1/24 16:09
 * @description: 懒汉式，线程安全
 */
@SuppressWarnings("InstantiationOfUtilityClass")
public class Singleton {

    // 保持一个静态实例变量
    private static Singleton instance;

    // 私有构造方法，防止外部实例化
    private Singleton(){
        // 防止通过反射实例化
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    /**
     * 具备很好的 lazy loading(懒加载效果)，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
     * 加锁虽然保证了安全，但是效率低，因为 synchronized 加在了方法上面，每一次调用getInstance都会进行加锁。
     * 所以，这种方式是不被推荐的！ 建议参考：双检锁
     */
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
