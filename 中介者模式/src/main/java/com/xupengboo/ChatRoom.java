package com.xupengboo;

import java.util.Date;

/**
 * @author: xupengboo
 * @date: 2024/3/6 21:48
 * @description: ；中间 聊天室
 */
// 具体中介者
public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }

}
