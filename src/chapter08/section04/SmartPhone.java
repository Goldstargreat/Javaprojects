package chapter08.section04;

public class SmartPhone implements Phone{
    @Override
    public void callPhone(String phoneNumber) {
        System.out.println("smartPhone Calling" + phoneNumber);
    }

    @Override
    public void receivePhone(String phoneNumber) {
        System.out.println("smartPhone Receive" + phoneNumber);
    }
    public void sendSMS(String phoneNumber, String message){
        System.out.println("Sending SMS to" + phoneNumber);
        System.out.println(message);
    }
    public void receiveSMS(String phoneNumber, String message){
        System.out.println("Receiving SMS from" + phoneNumber);
        System.out.println(message);
    }
    public void installApp(String appName){
        System.out.println("Installing app " + appName);
    }
}
