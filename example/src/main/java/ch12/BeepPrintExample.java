package ch12;

// import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        
        // Thread thread = new Thread(new Runnable() {
        //     public void run() {
        //         Toolkit toolkit = Toolkit.getDefaultToolkit();
        //         for(int i = 0; i < 5; i++) {
        //             try {
        //                 toolkit.beep();
        //                 Thread.sleep(500);
        //             } catch (Exception e) {
                    
        //             }
        //         }
        //     }
        // });

        // Thread thread2 = new Thread(new Runnable() {
        //     public void run() {
        //         for(int i = 0; i < 5; i++) {
        //             try {
        //                 System.out.println("띵");
        //                 Thread.sleep(500);
        //             } catch (Exception e) {
        
        //             }
        //         }
        //     }
        // });

        Runnable beepTask = new BeepTask();
        Runnable printTask = new PrintTask();
        Thread thread = new Thread(beepTask);
        Thread thread2 = new Thread(printTask);

        thread2.start();
        thread.start();


        // for(int i = 0; i < 5; i++) {
        //     try {
        //         System.out.println("띵");
        //         Thread.sleep(500);
        //     } catch (Exception e) {

        //     }
        // }
    }
}
