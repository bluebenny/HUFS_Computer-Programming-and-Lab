package bluebenny.karel.example;

import java.util.ArrayList;
// import java.util.Random;

import hufs.karel.HKarel;
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

        ArrayList<HObject> arr2 = new ArrayList<HObject>();
        arr2.add(new MyKarel("Sam"));
        arr2.add(new HKarel("Kim"));
        // arr2.add(new Random());
        
        add((HObject)arr2.get(0));
        add((HObject)arr2.get(1));
        // add((HObject)arr2.get(2));  // java.lang.ClassCastException 하지만 오류메세지 없음

    }

    @Override
    protected void onStart() {
        move(arr);
        
    }

    public static void main(String[] args) {
        HufsProgram.main(args, null);
    }


    
}
