package com.xupengboo.approve;

/**
 * @author: xupengboo
 * @date: 2024/2/28 14:46
 * @description: 请假审批抽象类
 */
// 抽象处理者
public abstract class Approve {

    protected Approve next;

    public void setNext(Approve next) {
        this.next = next;
    }

    public abstract void approve(int days);

}
