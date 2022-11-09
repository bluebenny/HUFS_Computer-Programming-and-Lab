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

    public void moveToWall() {
        while(!frontIsBlocked())
            move();
    }
}
