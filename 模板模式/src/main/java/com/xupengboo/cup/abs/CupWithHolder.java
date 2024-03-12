package com.xupengboo.cup.abs;

import com.xupengboo.cup.Cup;

/**
 * @Author xupengboo
 * @Date 2024/3/12 12:40
 * @Describe
 */
public class CupWithHolder extends Cup {

    @Override
    public void intoMold() {
        System.out.println("Inject material into mold for cup with holder");
    }

}
