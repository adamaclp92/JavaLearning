package Telephone;

public class Main {
    public static void main(String[] args) {
        ITelephone adamsPhone;
        adamsPhone = new DeskPhone(1234566);
        adamsPhone.powerOn();
        adamsPhone.dial(1234566);
        adamsPhone.callPhone(1234566);
        adamsPhone.answer();

        System.out.println();

        adamsPhone = new MobilePhone(1234);
        adamsPhone.powerOn();
        adamsPhone.callPhone(1234);
        adamsPhone.answer();
    }
}
