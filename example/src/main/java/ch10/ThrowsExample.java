package ch10;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            findClass();
        // } catch (Exception e) {
            // System.out.println("Caught Exception"); // 컴파일 오류 발생: Specific -> General한 순서대로 오류를 catch해야 함.
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
        } catch (Exception e) {
            System.out.println("Caught Exception");
        }
    }

    public static void findClass() throws ClassNotFoundException {
        // Class clazz = Class.forName("java.lang.String2");
    }
}
