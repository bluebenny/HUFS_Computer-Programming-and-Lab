package ch09;

public class CallListener implements Button.OnClickListener {
    @Override
    public void onClick() {
        System.out.println("calling...");
    }
}
