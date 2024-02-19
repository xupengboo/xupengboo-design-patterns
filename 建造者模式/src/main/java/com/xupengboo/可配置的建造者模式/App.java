package com.xupengboo.可配置的建造者模式;

import com.xupengboo.可配置的建造者模式.builder.*;

/**
 * @author: xupengboo
 * @date: 2024/1/25 13:36
 * @description: 客户端代码
 */
public class App {

    public static void main(String[] args) {
        // 创建Desktop
        AbstractComputerBuilder desktopBuilder = new DesktopBuilder();
        Director director = new Director();
        Computer desktop = director.construct(desktopBuilder, "NVIDIA RTX 3080", "Windows 10");
        desktop.showInfo();
        // 创建Laptop
        AbstractComputerBuilder laptopBuilder = new LaptopBuilder();
        Computer laptop = director.construct(laptopBuilder, "NVIDIA GTX 1650", "Ubuntu 20.04");
        laptop.showInfo();
    }

}
