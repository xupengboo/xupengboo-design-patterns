package com.xupengboo.shape;

import com.xupengboo.draw.DrawAPI;

/**
 * @author: xupengboo
 * @date: 2024/1/26 16:56
 * @description: 圆类
 */
public class Circle extends Shape{

    private int x,y,radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }

}
