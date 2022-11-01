package ch07.com.apple;

public class Person {

    public String name = "하하";


    public Person() {
    }

    public void eat() {
        System.out.println("OOPS");
    }

    public void eat(int no) {
        System.out.println("eat " + no);
    }
    
    public void getName() {
        System.out.println(name);
    }
}
