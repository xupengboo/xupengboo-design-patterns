package com.xupengboo;


import com.xupengboo.draw.GreenCircle;
import com.xupengboo.draw.RedCircle;
import com.xupengboo.shape.Circle;
import com.xupengboo.shape.Shape;

public class App {

    public static void main( String[] args ) {
        // 本意：创建不同形状大小和不同颜色的圆形
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(200, 200, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }

}
