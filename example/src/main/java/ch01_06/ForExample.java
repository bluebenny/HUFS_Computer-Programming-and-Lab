package ch01_06;

public class ForExample {
    public static void main(String[] args) {

        // for

        int sum = 0, i;

        for(i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1~" + (i - 1) + "까지의 합: " + sum);

        // while

        sum = 0;
        i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("1~" + (i - 1) + "까지의 합: " + sum);

        // do-while

        sum = 0;
        i = 1;
        do {
            sum += i;
            i++;
        } while (i <= 100);
        System.out.println("1~" + (i - 1) + "까지의 합: " + sum);
    }
}