package bluebenny.karel;

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
        if(karel.noBeepersPresent())
            karel.putBeeper();
        karel.turnAround();
        if(karel.frontIsClear())
            karel.move();

        while(karel.noBeepersPresent()) {
            while(karel.noBeepersPresent())
                karel.move();
            karel.turnAround();
            karel.move();
            karel.putBeeper();
            karel.move();
        }

        karel.turnAround();
        if(karel.frontIsClear())
            karel.move();
        karel.putBeeper();

        karel.moveToWall();
        karel.turnAround();
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
