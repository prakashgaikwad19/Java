package gfgSite.factoryDesignPattern;

public class NotificationFactory {
	public Notification createNotification(String notificationType) {
		if(notificationType==null) {
			return null;
		}
		if(notificationType.equalsIgnoreCase("sms")) {
			return new SmsNotification();
		}
		if(notificationType.equalsIgnoreCase("email")) {
			return new EmailNotification();
		}
		if(notificationType.equalsIgnoreCase("push")) {
			return new PushNotification();
		}
		return null;
	}
}
