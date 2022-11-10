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
        
        karel.putBeeper();
        karel.moveToWall();
        karel.putBeeper();
        karel.turnAround();
        karel.move();

        do {
            while(karel.noBeepersPresent())
                karel.move();
            karel.turnAround();
            karel.move();
            karel.putBeeper();
            karel.move();
        } while(karel.noBeepersPresent());

        karel.turnAround();
        karel.move();
        karel.putBeeper();

        karel.moveToWall();
        karel.pickBeeper();
        while(karel.frontIsClear()){
            karel.move();
            karel.pickBeeper();
        }
    }

    
    public static void main(String[] args) {
        HufsProgram.main(args, new GeonuKarel("건우"));
    }

}
