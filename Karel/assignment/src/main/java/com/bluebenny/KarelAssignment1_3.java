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

        while(true) {
            boolean side = karel.facingEast();

            karel.moveToWall();
            if(side)
                karel.turnLeft();
            else
                karel.turnRight();
            
            if(karel.frontIsBlocked()) break;

            karel.move();
            if(side)
                karel.turnLeft();
            else
                karel.turnRight();
        }
    }

    public static void main(String[] args) {
        HufsProgram.main(args, new GeonuKarelMk2("건우"));
    }
    
}
