package factory;

public class NotificationFactory {
    
    public static Notification createNotification(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("Notification type cannot be null or empty");
        }

        switch(type.toLowerCase()) {
            case "email":
                return new EmailNotification();
            
            case "sms":
                return new SMSNotification();

            case "push":
                return new PushNotification();

            default:
                throw new IllegalArgumentException("Unknown notificaiton type: " + type);
        }
    }
}
