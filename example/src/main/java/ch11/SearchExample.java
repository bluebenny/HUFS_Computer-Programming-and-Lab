package ch11;

import java.util.Arrays;

public class SearchExample {

    static void printArray(int[] arr) {
        for(int a : arr)
            System.out.print(a + " ");
        System.out.println();
    }

    static void printArray(String[] arr) {
        for(String a : arr)
            System.out.print(a + " ");
        System.out.println();
    }

    static void printArray(Member[] arr) {
        for(Member a : arr)
            System.out.print(a.name + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] scores = { 99, 97, 98 };
        printArray(scores);
        Arrays.sort(scores);
        printArray(scores);
        int index = Arrays.binarySearch(scores, 99);
        System.out.println("찾은 인덱스: " + index);

        String[] names = { "홍길동", "박동수", "김민수" };
        printArray(names);
        Arrays.sort(names);
        printArray(names);
        index = Arrays.binarySearch(names, "홍길동");
        System.out.println("찾은 인덱스: " + index);
        
        Member m1 = new Member("홍길동");
        Member m2 = new Member("박동수");
        Member m3 = new Member("김민수");
        Member[] members = { m1, m2, m3 };
        printArray(members);
        Arrays.sort(members);
        printArray(members);
        index = Arrays.binarySearch(members, m1);
        System.out.println("찾은 인덱스: " + index);
    }
}
