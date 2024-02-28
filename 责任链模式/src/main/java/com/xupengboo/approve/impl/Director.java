package com.xupengboo.approve.impl;

import com.xupengboo.approve.Approve;

/**
 * @author: xupengboo
 * @date: 2024/2/28 14:51
 * @description: 领导
 */
// 具体处理者
public class Director extends Approve {

    @Override
    public void approve(int days) {
        if (days <= 7) {
            System.out.println("Director approved");
        } else {
            System.out.println("Leave request denied");
        }
    }

}
