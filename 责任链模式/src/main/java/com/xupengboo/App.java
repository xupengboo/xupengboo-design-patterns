package com.xupengboo;

import com.xupengboo.approve.Approve;
import com.xupengboo.approve.impl.Director;
import com.xupengboo.approve.impl.Manager;
import com.xupengboo.approve.impl.TeamLeader;

/**
 * Hello world!
 *
 */
// 客户端代码
public class App {
    public static void main( String[] args ) {
        // 请假审批：团队领导审批不了；管理者审批，管理者审批不了；领导审批。
        Approve teamLeader = new TeamLeader();
        Approve manager = new Manager();
        Approve director = new Director();

        teamLeader.setNext(manager);
        manager.setNext(director);

        teamLeader.approve(1);
        teamLeader.approve(3);
        teamLeader.approve(6);
        teamLeader.approve(8);
    }
}
