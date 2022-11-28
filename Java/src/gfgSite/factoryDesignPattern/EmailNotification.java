package gfgSite.factoryDesignPattern;

public class EmailNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("This is email Notification");
		
	}

}
