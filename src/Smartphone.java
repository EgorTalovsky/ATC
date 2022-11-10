// Допишите реализацию класса Smartphone
public class Smartphone extends MobilePhone {

    public String appName = "WhatsApp";

    public Smartphone(String number) {
        super(number);
    }

    public Smartphone(String number, String appName) {
        super(number);
        this.appName = appName;
    }


    public final void sendEmail(String email, String messageText) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }

    public final void makeCall(String targetNumber, String appName) {
        System.out.println("Позвоним через приложение " + appName + " по номеру " + targetNumber);
    }

}