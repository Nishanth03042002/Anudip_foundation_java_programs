interface NotificationService {
    void sendNotification(String message);
}

class EmailNotification implements NotificationService {
    public void sendNotification(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SMSNotification implements NotificationService {
    public void sendNotification(String message) {
        System.out.println("SMS sent: " + message);
    }
}

class PushNotification implements NotificationService {
    public void sendNotification(String message) {
        System.out.println("Push notification sent: " + message);
    }
}

interface NotificationFactory {
    NotificationService getNotificationService(String type);
}

class NotificationFactoryImpl implements NotificationFactory {

    public NotificationService getNotificationService(String type) {

        if (type == null) {
            return null;
        }

        switch (type.toLowerCase()) {
            case "email":
                return new EmailNotification();
            case "sms":
                return new SMSNotification();
            case "push":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Invalid notification type");
        }
    }
}

public class interface2 {
    public static void main(String[] args) {

        NotificationFactory factory = new NotificationFactoryImpl();

        NotificationService service1 =
                factory.getNotificationService("email");
        service1.sendNotification("Welcome to our platform!");

        NotificationService service2 =
                factory.getNotificationService("sms");
        service2.sendNotification("Your OTP is 123456");

        NotificationService service3 =
                factory.getNotificationService("push");
        service3.sendNotification("You have a new message");
    }
}
