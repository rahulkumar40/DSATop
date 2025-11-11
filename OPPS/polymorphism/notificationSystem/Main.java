interface Notification {
    void send(String message);
}

class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending email : " + message);
    }
}

class SMSNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending SMS : " + message);
    }

}

public class Main {
    public static void main(String[] args) {
        Notification n = new SMSNotification();
        n.send("Your campaning is live !");
        n = new EmailNotification();
        n.send("YOur are great Email provider");
    }
}
