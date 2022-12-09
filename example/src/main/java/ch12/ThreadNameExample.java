package ch12;

public class ThreadNameExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("Current Thread Name: " + mainThread.getName());

        Thread threadA = new BeepThread();
        System.out.println("Current Thread Name: " + threadA.getName());
        threadA.start();

        Thread threadB = new PrintThread();
        System.out.println("Current Thread Name: " + threadB.getName());
        threadB.start();
    }
}