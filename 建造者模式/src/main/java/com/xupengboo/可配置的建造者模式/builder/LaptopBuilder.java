package com.xupengboo.可配置的建造者模式.builder;

/**
 * @author: xupengboo
 * @date: 2024/1/25 13:46
 * @description: 具体建造者类（laptop）
 */
// 具体建造者类 - LaptopBuilder
public class LaptopBuilder extends AbstractComputerBuilder {

    public void buildCPU() {
        computer.setCPU("Intel Core i5");
    }

    public void buildMemory() {
        computer.setMemory("8GB DDR4");
    }

    public void buildStorage() {
        computer.setStorage("512GB NVMe SSD");
    }

    public void buildGraphicsCard(String graphicCard) {
        computer.setGraphicsCard(graphicCard);
    }

    public void buildOperatingSystem(String operatingSystem) {
        computer.setOperatingSystem(operatingSystem);
    }

}
