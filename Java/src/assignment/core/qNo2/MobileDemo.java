package assignment.core.qNo2;

public class MobileDemo {

	public static void main(String[] args) {
		Mobile mobile1 = new Apple("Apple", "iOS", "iPhone11", 50000);
		System.out.println(mobile1.getModel());
		
		Mobile mobile2 = new Android("Samsung", "Android7.1.1", "Galaxy", 45000);
		System.out.println(mobile2.getModel());
		
		Mobile mobile3 = new Blackberry("Blackberry", "Android10", "KEY2E", 30000);
		System.out.println(mobile3.getModel());
	}

}
