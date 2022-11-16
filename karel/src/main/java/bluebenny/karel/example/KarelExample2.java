package bluebenny.karel.example;

import hufs.karel.Car;
import hufs.karel.HufsProgram;

public class KarelExample2 extends HufsProgram {
    
    MyKarel karel;
    Car car;

    public static void moveForward(Robot karel) {
        for(int i = 0; i < 15; i++)
            if(karel.frontIsClear())
                karel.move();
    }

    @Override
    protected void onInit() {
        karel = new MyKarel("Sam");
        add(karel);
    }

    @Override
    protected void onStart() {
        moveForward(karel);
    }

    public static void main(String[] args) {
        HufsProgram.main(args, null);
    }
}
