import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        // ArrayList<String> sarr = new ArrayList<String>();
        ArrayList<Integer> ai = new ArrayList<Integer>();
        
        // ai.add(new Integer(3));
        ai.add(3);

        Integer i = ai.get(0); // 기본 타입에 대한 Wrapper Class
        int no = i.intValue();

        int j = ai.get(0); // 이전 코드와 같이 컴파일함.

        System.out.println(no == j);

        //

        ArrayList<Double> darr = new ArrayList<Double>();
        // darr.add(new Double(3.4));
        darr.add(3.4);

        Double d = darr.get(0);
        double k = d.doubleValue();

        double m = darr.get(0);

        System.out.println(k == m);

    }
}
