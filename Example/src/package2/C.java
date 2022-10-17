package package2;

import package1.*;

public class C {
    public static void main(String[] args) {
        A a = new A();

        a.field1 = 1;
        // a.field2 = 1;
        // a.field3 = 1;

        a.method1();
        // a.method2();
        // a.method3();
    }
}
