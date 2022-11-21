package ch01_06;

public class SwitchExample { // p.117
    public static void main(String[] args) {
        int num = (int) (Math.random() * 10);
        
        switch(num) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
            case 4:
                System.out.println("4");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("789");
                break;
            default:
                System.out.println("OOPS");
                break;
        }

        // 문자

        char grade = (char)('A' + num);

        switch (grade) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            case 'D':
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }
        /*
        // String
        
        String str = "과장";
        
        switch(str) {
            case "부장":
                System.out.println("700만원");
                break;
            case "과장" :
                System.out.println("500만원");
                break;
            default:
                System.out.println("300만원");
        }
        */
    }
}