public class Main {
    public static void main(String[] args) {
        NotificationFactory emailFactory = new EmailNotificationFactory();
        Notification email = emailFactory.createNotification();
        email.notifyUser();

        NotificationFactory smsFactory = new SMSNotificationFactory();
        Notification sms = smsFactory.createNotification();
        sms.notifyUser();

        NotificationFactory pushFactory = new PushNotificationFactory();
        Notification push = pushFactory.createNotification();
        push.notifyUser();
    }
}
