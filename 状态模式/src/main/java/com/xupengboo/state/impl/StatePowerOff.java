package com.xupengboo.state.impl;

import com.xupengboo.state.State;

/**
 * @Author xupengboo
 * @Date 2024/3/11 13:47
 */
// 关闭状态 实体类
public class StatePowerOff implements State {

    @Override
    public void changeChannel() {
        System.out.println("电视已关机，无法调频道");
    }

    @Override
    public void changeSound() {
        System.out.println("电视已关机，无法调声音");
    }

}
