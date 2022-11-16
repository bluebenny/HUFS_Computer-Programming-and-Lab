package bluebenny.karel.example;

// package com.example;


import hufs.karel.HKarel;
// import hufs.karel.HufsProgram;

public class IceKarel extends HKarel {

    static final int COUNT_COLOR = 4;

    // private boolean isRed = true;
    private int colorMode = 0;

    IceKarel() {
        super("hello");
    }
    
    IceKarel(String name) {
        super(name);
    }

    @Override
    public void move() {
        if(colorMode == 0) setColorOfBody(RED);
        if(colorMode == 1) setColorOfBody(BLUE);
        if(colorMode == 2) setColorOfBody(YELLOW);
        if(colorMode == 3) setColorOfBody(GREEN);
        colorMode++;
        // setColorOfBody(isRed == true ? BLUE : RED);
        // isRed = !isRed;
        super.move();
        if(colorMode == COUNT_COLOR) colorMode = 0;
    }

    // @Override
    // protected void onStart() {
    //     HKarel karel = (HKarel)getHObject("철수");

    //     karel.move();
    //     karel.move();
    //     karel.turnRight();
    //     karel.move();
    //     karel.turnLeft();
    //     karel.move();

    //     karel.putBeeper();
    //     karel.turnAround();

    //     karel.move();
    //     karel.move();
    //     karel.move();
    //     karel.turnRight();
    //     karel.move();
    //     karel.turnRight();
        
    // }

    public void moveToWall() {
        while(!frontIsBlocked())
            move();
    }
}
