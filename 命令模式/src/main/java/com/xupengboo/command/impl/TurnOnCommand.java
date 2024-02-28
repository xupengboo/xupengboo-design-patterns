package com.xupengboo.command.impl;

import com.xupengboo.command.Command;
import com.xupengboo.domin.TV;

/**
 * @author: xupengboo
 * @date: 2024/2/28 15:10
 * @description: 关闭命令
 */
// 具体命令
public class TurnOnCommand implements Command {

    private TV tv;

    public TurnOnCommand(TV tv){
        this.tv = tv;
    }

    public void execute() {
        tv.turnOn();
    }

}
