package bluebenny.karel;

import hufs.karel.HObject;
import hufs.karel.HufsProgram;

public class KarelExample extends HufsProgram {


    Robot arr[];

    public static void move(Robot[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].frontIsClear())
                arr[i].move();
        }
    }

    @Override
    protected void onInit() {
        arr = new Robot[2];
        arr[0] = new MyKarel("Sam");
        arr[1] = new MyKarel("Kim");

        add((HObject)arr[0]);
        add((HObject)arr[1]);
    }

    @Override
    protected void onStart() {
        move(arr);
        
    }

    public static void main(String[] args) {
        HufsProgram.main(args, null);
    }


    
}
