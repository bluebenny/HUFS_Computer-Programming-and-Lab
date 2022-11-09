package com.bluebenny;

import hufs.karel.HufsProgram;

public class KarelAssignment1_4 extends HufsProgram {

    GeonuKarel karel;

    @Override
    protected void onInit() {
        karel = (GeonuKarel)getHObject("건우");
    }

    @Override
    protected void onStart() {
        karel.move();
        
    }

    
    public static void main(String[] args) {
        HufsProgram.main(args, new GeonuKarel("건우"));
    }

}
