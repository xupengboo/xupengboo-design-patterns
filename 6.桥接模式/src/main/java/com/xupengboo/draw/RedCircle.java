package com.xupengboo.draw;

/**
 * @author: xupengboo
 * @date: 2024/1/26 16:46
 * @description: 红圈
 */
// 实体桥接实现类
public class RedCircle implements DrawAPI {

    public void drawCircle(double radius, double x, double y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }

}
