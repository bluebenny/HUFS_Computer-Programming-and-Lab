package ch12;

public class PrintThread extends Thread {
    
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            try {
                System.out.println("띵");
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}
