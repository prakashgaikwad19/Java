package gfgSite.factoryDesignPattern;

public class SmsNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("This is sms Notification");
	}
	
}
