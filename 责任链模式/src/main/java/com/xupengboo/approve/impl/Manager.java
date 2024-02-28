package com.xupengboo.approve.impl;

import com.xupengboo.approve.Approve;

/**
 * @author: xupengboo
 * @date: 2024/2/28 14:50
 * @description: 管理者
 */
// 具体处理者
public class Manager extends Approve {

    @Override
    public void approve(int days) {
        if (days <= 5) {
            System.out.println("Manager approved");
        } else {
            next.approve(days);
        }
    }

}
