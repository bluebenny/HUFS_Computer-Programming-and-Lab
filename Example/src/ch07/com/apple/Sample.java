package ch07.com.apple;

public class Sample {
    public static void main(String[] args) {
        Student 철수 = new Student();
        // Student 객체를 Person Interface로 조작한다.

        철수.eat();
        System.out.println(철수.name);
        철수.getName();
        철수.getName2();

        // Student object2 = (Student) new Person();
        // object2.eat(4);


    }
    
    public static void eatPersons(Person[] p) {
        for(int i = 0; i < p.length; i++)
            p[i].eat();
    }
}