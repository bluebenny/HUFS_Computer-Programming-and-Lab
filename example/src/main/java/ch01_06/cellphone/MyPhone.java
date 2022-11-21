package ch01_06.cellphone;

public class MyPhone extends CellPhone{

    int channel;



    void powerOn() { // overwriting
        System.out.println("짜잔!!");
    }

    void turnOnDmb() {
        System.out.println("채널" + channel + "번 DMB 방송을 수신합니다");
    }

    /** 채널을 바꾸는 메소드 */
    void changeChannelDmb(int channel) {
        this.channel = channel;
        System.out.println("채널" + channel + "번으로 바꿉니다.");
    }

    void turnOffDmb() {
        System.out.println("DMB 방송 수신을 멈춥니다.");
    }
}
