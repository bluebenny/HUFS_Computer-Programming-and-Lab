package com.bluebenny;

import hufs.karel.HKarel;

public class GeonuKarelMk2 extends HKarel {

    static boolean beeperTurn = true;

    
    GeonuKarelMk2(String name) {
        super(name);
    }

    @Override
    public void move() {
        if(beeperTurn) putBeeper();
        super.move();
        beeperTurn = !beeperTurn;
    }

    //Overloading
    public void move(int distance) {
        for(int i = 0; i < distance; i++)
            this.move();
    }

    public void moveToWall() {
        while(!frontIsBlocked())
            move();
    }
}

