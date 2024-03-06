package com.xupengboo;

/**
 * @author: xupengboo
 * @date: 2024/3/6 21:49
 * @description: 用户类
 */
// 具体同事类
public class User {

    String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }

}
