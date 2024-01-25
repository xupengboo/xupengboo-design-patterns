package com.xupengboo.链式调用的建造者模式;

import com.xupengboo.链式调用的建造者模式.builder.Computer;
import com.xupengboo.链式调用的建造者模式.builder.ComputerBuilder;

/**
 * @author: xupengboo
 * @date: 2024/1/25 13:58
 * @description:
 */
public class App {

    public static void main(String[] args) {
        // 使用链式调用构建电脑
        Computer computer = new ComputerBuilder()
                .buildCPU("Intel Core i7")
                .buildMemory("16GB DDR4")
                .buildStorage("1TB SSD")
                .buildGraphicsCard("NVIDIA RTX 3080")
                .buildOperatingSystem("Windows 10")
                .getResult();
        computer.showInfo();
    }

}
