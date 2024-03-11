package com.xupengboo.state.impl;

import com.xupengboo.state.State;

/**
 * @Author xupengboo
 * @Date 2024/3/11 13:46
 */
// 打开状态 实体类
public class StatePowerOn implements State {

    @Override
    public void changeChannel() {
        System.out.println("调频道");
    }

    @Override
    public void changeSound() {
        System.out.println("调声音");
    }

}
