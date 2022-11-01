package ch07.com.apple;

public class StudentExample {

    public static final int NO_PERSON = 4;

    public static void main(String[] args) {

        // Student[] arr = new Student[NO_PERSON];
        // for(int i = 0; i < NO_PERSON; i++)
        //     arr[i] = new Student();

        Student[] arr = new Student[NO_PERSON];
        arr[0] = new Student();
        arr[1] = new Student();
        arr[2] = new Student();
        arr[3] = new Student();

        // for(int i = 0; i < NO_PERSON; i++)
        //     arr[i].eat();
        Sample.eatPersons(arr);
    }

    
}
