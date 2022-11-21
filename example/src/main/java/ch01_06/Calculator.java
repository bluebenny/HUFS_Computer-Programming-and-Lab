package ch01_06;

public class Calculator {
    static double pi = 3.14159;
    
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    static int plus(int x, int y) {
        return x + y;
    }

    static int minus(int x, int y) {
        return x - y;
    }

    double divide(int x, int y) {
        double result = (double)x / (double)y;
        return result;
    }

    void powerOff() {
        System.out.println("전원을 끕니다");
    }

    // 정사각형의 넓이
    double areaRectangle(double width) {
        return width * width;
    }

    // 직사각형의 넓이
    double areaRectangle(double width, double height) {
        return width * height;
    }
}