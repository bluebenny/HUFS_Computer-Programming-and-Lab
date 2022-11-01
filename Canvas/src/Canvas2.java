class Canvas2 {

    int studentNumber;
    static int count;
    static long schoolNumber = 17846;
    

    Canvas2(int num) {
        studentNumber = num;
    }

    Canvas2() {
        studentNumber++;
        count++;
    }
        

    
    void setStudentNumber(int num) {
        if(num == 777) setVipStudentNumber(num);
        else studentNumber = num;
    }

    int getStudentNumber() {
        return studentNumber;
    }

    void setVipStudentNumber(int num) {
        studentNumber = num * 10 + count++;
    }

}

class Canvas3 {
    int studentNumber;

    public Canvas3() {
        Canvas2 vip = new Canvas2();
        vip.setStudentNumber(777);
    }
}