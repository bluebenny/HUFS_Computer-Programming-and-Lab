package ch11;

public class MathExample {
    public static void main(String[] args) {
        int v1 = Math.abs(-5);
        double v2 = Math.abs(-3.14);
        System.out.println(v1);
        System.out.println(v2);

        double v3 = Math.ceil(5.3);
        double v4 = Math.ceil(-5.3);
        System.out.println(v3);
        System.out.println(v4);

        for(int i = 0; i < 6; i++)
            System.out.println((int)(Math.random() * 45) + 1);
        
    }
}
