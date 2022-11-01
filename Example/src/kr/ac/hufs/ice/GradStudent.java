package kr.ac.hufs.ice;

import ch07.com.apple.Person;
import ch07.com.apple.Student;
import ch07.com.apple.Sample;

public class GradStudent extends Student {
    @Override
    public void eat() {
        System.out.println("오물오물");
    }

    public static void main(String[] args) {
        Person[] arr = new Person[4];
        arr[0] = new Person();
        arr[1] = new Student();
        arr[2] = new GradStudent();
        arr[3] = new GradStudent();

        Sample.eatPersons(arr);
        
    }
}
