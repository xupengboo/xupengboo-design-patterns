package com.xupengboo.command.impl;

import com.xupengboo.command.Command;
import com.xupengboo.domin.TV;

/**
 * @author: xupengboo
 * @date: 2024/2/28 15:13
 * @description: 打开命令
 */
// 具体命令
public class TurnOffCommand implements Command {

    private TV tv;

    public TurnOffCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.turnOff();
    }

}
