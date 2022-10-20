package cellphone;

public class CellPhoneExample {

    static void run(CellPhone phone) {
        phone.powerOn();
        phone.bell();
        phone.sendVoice("안녕");
        phone.hangUp();
    }

    public static void main(String[] args) {
        
        CellPhone phone = new HerPhone();
        run(phone);

        System.out.println();

        phone = new YourPhone();
        run(phone);

        System.out.println();

        phone = new CellPhone();
        run(phone);

        // phone.bell();
        // phone.sendVoice("안녕");
        // phone.hangUp();

        // System.out.println();
        
        // phone.turnOnDmb();
        // phone.changeChannelDmb(7);
        // phone.turnOffDmb();
    }
}
