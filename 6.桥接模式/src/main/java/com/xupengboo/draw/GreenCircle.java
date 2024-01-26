package com.xupengboo.draw;

/**
 * @author: xupengboo
 * @date: 2024/1/26 16:48
 * @description: 绿圈
 */
// 实体桥接实现类
public class GreenCircle implements DrawAPI{

    public void drawCircle(double radius, double x, double y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }

}
