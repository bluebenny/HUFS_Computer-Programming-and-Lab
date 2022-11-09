package com.bluebenny;

import hufs.karel.HufsProgram;

public class KarelAssignment1_3 extends HufsProgram {

    GeonuKarelMk2 karel;

    @Override
    protected void onInit() {
        karel = (GeonuKarelMk2)getHObject("건우");
    }

    @Override
    protected void onStart() {
        int turnTimes = 1;

        while(true) {
            karel.moveToWall();
            
            karel.turnLeft(turnTimes);
            
            if(karel.frontIsBlocked()) break;

            karel.move();
            karel.turnLeft(turnTimes);

            turnTimes = (turnTimes == 1) ? 3 : 1;
        }
    }

    public static void main(String[] args) {
        HufsProgram.main(args, new GeonuKarelMk2("건우"));
    }
    
}
