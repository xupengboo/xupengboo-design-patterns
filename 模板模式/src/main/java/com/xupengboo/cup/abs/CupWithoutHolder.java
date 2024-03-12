package com.xupengboo.cup.abs;

import com.xupengboo.cup.Cup;

/**
 * @Author xupengboo
 * @Date 2024/3/12 12:40
 * @Describe
 */
public class CupWithoutHolder extends Cup {

    @Override
    public void intoMold() {
        System.out.println("Inject material into mold for cup without holder");
    }

}
