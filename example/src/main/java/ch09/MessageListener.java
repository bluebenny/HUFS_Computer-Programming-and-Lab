package ch09;

public class MessageListener implements Button.OnClickListener {
    @Override
    public void onClick() {
        System.out.println("sending message...");
    }
}
