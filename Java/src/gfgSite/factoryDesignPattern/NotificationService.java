package gfgSite.factoryDesignPattern;

public class NotificationService {

	public static void main(String[] args) {
		NotificationFactory notificationFactory=new NotificationFactory();
	//	notificationFactory.createNotification("sms").notifyUser();
		Notification notificationObj = notificationFactory.createNotification("email");
		notificationObj.notifyUser();
	}

}
