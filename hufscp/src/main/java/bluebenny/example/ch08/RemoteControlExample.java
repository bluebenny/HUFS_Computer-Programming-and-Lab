package bluebenny.example.ch08;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rm = createControl();
        rm.turnOn();

        
    }

    public static RemoteControl createControl() {
        class MyClass implements RemoteControl {
            public void turnOn() {
                System.out.println("ON");
            }
        }

        RemoteControl rm = new MyClass();
        return rm;
    }

    public static RemoteControl createContorl2() {
        return new RemoteControl() { // 익명클래스의 좋은 예.
            public void turnOn() {
                System.out.println("ON");
            }
        };
    }
}
