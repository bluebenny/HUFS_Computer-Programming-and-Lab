package bluebenny.example.ch01_06;

public class IfExample {
    public static void main(String[] args) {
        int score = 93;

        // if

        if (score >= 90) {
            System.out.println("A");
        }

        if (score < 90) {
            System.out.println("B");
        }

        // if-else

        if (score >= 90) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }

        // if=else if-else

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        // 중첩 if

        if (score >= 90) {
            if (score >= 95) {
                System.out.println("A+");
            } else {
                System.out.println("A0");
            }
        } else {
            if (score >= 85) {
                System.out.println("B+");
            } else {
                System.out.println("B0");
            }
        }
    }
}