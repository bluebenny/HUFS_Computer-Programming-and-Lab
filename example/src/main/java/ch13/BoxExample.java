package ch13;

public class BoxExample {
    public static void main(String[] args) {
        Box<String> box = new Box<String>();
        box.set("홍길동");
        String name = (String) box.get();

        System.out.println(name);
    }
}
