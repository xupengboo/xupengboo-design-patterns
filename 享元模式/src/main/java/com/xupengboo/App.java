package com.xupengboo;

import com.xupengboo.shape.Shape;
import com.xupengboo.shape.factory.ShapeFactory;

/**
 * Hello world!
 *
 */
// 客户端代码
public class App {

    public static void main( String[] args ) {
        String[] colors = {"Red","Green","Blue"};
        for (int i = 0; i < 10; i++) {
            String color = colors[(int) (Math.random() * colors.length)];
            Shape circle = ShapeFactory.getCircle(color);
            circle.draw();
        }
    }

}
