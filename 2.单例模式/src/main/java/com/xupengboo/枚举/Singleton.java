package com.xupengboo.枚举;

/**
 * @author: xupengboo
 * @date: 2024/1/24 16:50
 * @description:
 */
public enum Singleton {

    /**
     * 使用枚举（Enum）实现单例模式是一种简洁且安全的方式。
     * 在Java中，枚举类型的实例在JVM中是唯一的，并且枚举类型的实例是在加载枚举类的时候被创建的，保证了线程安全和懒加载。
     *
     * 使用枚举实现单例模式的优势包括：
     *   线程安全： 枚举类型在加载时就实例化，因此不需要担心多线程环境下的线程安全问题。
     *   懒加载： 枚举实例在第一次被访问时才会被创建，实现了懒加载的效果。
     *   防止反射攻击和序列化问题： 枚举类型天然防止通过反射调用构造方法实例化多个对象，而且枚举实例在序列化和反序列化时会保持一致，防止序列化攻击。
     */
    INSTANCE;

    // 其他业务逻辑方法
    public void doSomething(){
        System.out.println("Singleton is doing something.");
    }

}

class EnumUsageExample {

    public static void main(String[] args) {
        // 调用枚举的方法
        Singleton.INSTANCE.doSomething();
    }

}
