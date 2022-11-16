package bluebenny.karel.assignment;

import hufs.karel.HufsProgram;

public class KarelAssignment1_3 extends HufsProgram {

    GeonuKarel karel;

    @Override
    protected void onInit() {
        karel = (GeonuKarel)getHObject("건우2");
    }

    @Override
    protected void onStart() {

        while(true) {
            karel.moveToWall();

            if(karel.isOnRightSide)
                karel.turnLeft();
            else
                karel.turnRight();
            
            if(karel.frontIsBlocked()) break;

            karel.move();
            if(karel.isOnRightSide)
                karel.turnLeft();
            else
                karel.turnRight();
        }
    }

    
    public static void main(String[] args) {
        HufsProgram.main(args, new GeonuKarelMk2("건우2"));
    }
    
}
