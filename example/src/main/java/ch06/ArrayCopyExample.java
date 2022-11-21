package ch06;

public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] oldIntArray = { 1, 2, 3 };
        int[] newIntArray = new int[5];

        for(int i = 0; i < oldIntArray.length; i++)
            newIntArray[i] = oldIntArray[i];
        
        for(int value : newIntArray)
            System.out.print(value + ",");
        System.out.println();

        String[] oldStrArray = { "java", "array", "copy" };
        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for(String str : newStrArray)
            System.out.print(str + ",");
        System.out.println();
    }
}