package ch07.com.samsung;

import ch07.com.apple.Person;

public class E extends Person {
    
    public void eat() {
        name = "value";
        super.eat();
    }
}
