package ch12;

public class BeepPrintExample2 {
    public static void main(String[] args) throws Exception {

        // Runnable beepTask = new BeepTask();
        // Thread thread = new Thread(beepTask);

        Thread thread = new BeepThread();
        Thread thread2 = new BeepThread();
        
        thread.start();
        Thread.sleep(500);
        thread2.start();
        for(int i = 0; i < 5; i++) {
            try {
                System.out.println("띵");
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}
