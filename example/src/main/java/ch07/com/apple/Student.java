package ch07.com.apple;

public class Student extends Person {

    String name = "호호";


    @Override
    public void eat() {
        // A a = new A();
        // a.field = "value";
        // a.method();

        System.out.println("냠냠");
    }

    public void drink(String name) {
        name = "홍길동"; // args
        this.name = "김건우"; // Student
        super.name = "김건우2"; // Person

        System.out.println("drinking");
    }

    // @Override
    // public void getName() {
    //     System.out.println(name);
    // }

    public void getName2() {
        System.out.println(name);
    }
}