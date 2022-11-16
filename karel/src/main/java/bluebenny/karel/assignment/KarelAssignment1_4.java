package bluebenny.karel.assignment;

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
        if(karel.frontIsBlocked()) return;
        
        karel.moveToWall();
        karel.putBeeper();
        karel.turnAround();
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
