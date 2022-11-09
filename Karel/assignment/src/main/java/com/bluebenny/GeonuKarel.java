package com.bluebenny;

import hufs.karel.HKarel;

public class GeonuKarel extends HKarel {
    
    public GeonuKarel(String name) {
        super(name);
    }

    //Overloading
    public void move(int distance) {
        for(int i = 0; i < distance; i++)
            this.move();
    }

    //Overloading
    public void turnLeft(int times) {
        for(int i = 0; i < times; i++)
            super.turnLeft();
    }

    public void moveToWall() {
        while(!frontIsBlocked())
            move();
    }
}
