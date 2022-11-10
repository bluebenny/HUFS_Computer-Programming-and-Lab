package bluebenny.karel;

import hufs.karel.HKarel;

public class GeonuKarel extends HKarel {

    boolean isOnRightSide = false;
    
    public GeonuKarel(String name) {
        super(name);
    }

    //Overloading
    public void move(int distance) {
        for(int i = 0; i < distance; i++)
            this.move();
    }

    public void moveToWall() {
        while(frontIsClear())
            move();
        // 벽에 닿았을 때 오른쪽을 보고 있다 == karel이 오른쪽 끝에 와있다.
        isOnRightSide = facingEast();
    }
    
}
