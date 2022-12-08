package ch12;

import java.awt.*;

public class BeepThread extends Thread {
    public BeepThread() {
        setName("BeepThread");
    }
    
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 0; i < 5; i++) {
            try {
                System.out.println("beep");
                toolkit.beep();
                Thread.sleep(500);
            } catch (Exception e) {
            
            }
        }
    }
}
