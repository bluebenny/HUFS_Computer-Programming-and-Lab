package bluebenny.example.ch01_06;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);

        int v1 = scan1.nextInt();
        double v2 = scan1.nextDouble();
        boolean v3 = scan1.nextBoolean();
        
        String str = scan1.next();
//        String line = scan1.nextLine();

        System.out.println("v1: " + v1);
        System.out.println("v2: " + v2);
        System.out.println("v3: " + v3);
        System.out.println("str: " + str);
//        System.out.println("line: " + line);

        scan1.close();
    }
}