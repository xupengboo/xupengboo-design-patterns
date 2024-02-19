package com.xupengboo.shape;

import com.xupengboo.draw.DrawAPI;

/**
 * @author: xupengboo
 * @date: 2024/1/26 16:49
 * @description: 形状抽象类
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();

}
