package com.xupengboo.cup;

/**
 * @Author xupengboo
 * @Date 2024/3/12 12:38
 * @Describe 杯子抽象类
 */
// 抽象类
public abstract class Cup {

    public void prepareMaterial() {
        System.out.println("Prepare material");
    }

    public void meltMaterial() {
        System.out.println("Melt material");
    }

    public abstract void intoMold(); // 抽象方法，由子类实现

    public void coolDown() {
        System.out.println("Cool down and form the cup");
    }

    // 模板方法，定义了制造杯子的整体流程
    public final void makeCup() {
        prepareMaterial();
        meltMaterial();
        intoMold(); // 调用子类实现的注入模具步骤
        coolDown();
    }

}
