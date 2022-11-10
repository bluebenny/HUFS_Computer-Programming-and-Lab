package bluebenny.karel;

import hufs.karel.HufsProgram;

public class KarelAssignment1_2 extends HufsProgram {
    
    GeonuKarel karel;

    @Override
    protected void onInit() {
        karel = (GeonuKarel)getHObject("건우");
    }

    @Override
    protected void onStart() {

        boolean mark = false;
        do {
            if(!mark) mark = true;
            else karel.move(4);

            karel.turnLeft();
            if(karel.noBeepersPresent()) karel.putBeeper();
            while(karel.frontIsClear()) {
                karel.move();
                if(karel.noBeepersPresent()) karel.putBeeper();
            }

            karel.turnAround();
            karel.moveToWall();

            karel.turnLeft();
        } while(karel.frontIsClear());
        
    }

    
    public static void main(String[] args) {
        HufsProgram.main(args, new GeonuKarel("건우"));
    }
    
}
