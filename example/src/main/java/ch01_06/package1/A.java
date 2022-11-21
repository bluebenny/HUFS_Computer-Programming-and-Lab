package ch01_06.package1;

public class A {
    public int field1;
    int field2;
    private int field3;

    public A() {
        field1 = 1;
        field2 = 1;
        field3 = 1;

        System.out.println(field3);

        method1();
        method2();
        method3();
    }

    public void method1() {
        System.out.println("method1");
    }
    void method2() {
        System.out.println("method2");
    }
    private void method3() {
        System.out.println("method3");
    }
}
