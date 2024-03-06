package com.xupengboo;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
        // 创建两个用户
        User robert = new User("Robert");
        User john = new User("John");
        // 向聊天室（中介者）发消息
        robert.sendMessage("Hi!John!");
        john.sendMessage("Hello!Robert!");
    }

}
