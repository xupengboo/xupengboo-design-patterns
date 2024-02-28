package com.xupengboo.approve.impl;

import com.xupengboo.approve.Approve;

/**
 * @author: xupengboo
 * @date: 2024/2/28 14:49
 * @description: 团队领导者
 */
// 具体处理者
public class TeamLeader extends Approve {

    @Override
    public void approve(int days) {
        if (days <= 2) {
            System.out.println("Team Leader approved");
        } else {
            next.approve(days);
        }
    }

}
