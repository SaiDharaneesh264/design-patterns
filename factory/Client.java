package factory;

public class Client {
    public static void main(String[] args) {
        Notification emailNotification = NotificationFactory.createNotification("email");
        emailNotification.notifyUser();

        Notification smsNotification = NotificationFactory.createNotification("sms");
        smsNotification.notifyUser();

        Notification pushNotification = NotificationFactory.createNotification("push");
        pushNotification.notifyUser();
    }
    
}
