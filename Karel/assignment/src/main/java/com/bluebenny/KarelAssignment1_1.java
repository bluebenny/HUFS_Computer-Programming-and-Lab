package com.bluebenny;

import hufs.karel.HufsProgram;

public class KarelAssignment1_1 extends HufsProgram {

    GeonuKarel karel;

    @Override
    protected void onInit() {
        karel = (GeonuKarel)getHObject("건우");
    }

    @Override
    protected void onStart() {

        karel.move();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.turnLeft();
        karel.move();

        karel.putBeeper();
        karel.turnAround();

        karel.move();
        karel.move();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.turnRight();
        
    }

    public static void main(String[] args) {
        HufsProgram.main(args, new GeonuKarel("철수"));
    }
    
}
