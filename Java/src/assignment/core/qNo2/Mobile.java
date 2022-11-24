package assignment.core.qNo2;

public class Mobile {
	String manufacturer;
	String operating_system;
	String model;
	double cost;
	
	public String getModel() {
		System.out.println("This is Mobile class");
		return model;
	}

	public Mobile(String manufacturer, String operating_system, String model, double cost) {
		super();
		this.manufacturer = manufacturer;
		this.operating_system = operating_system;
		this.model = model;
		this.cost = cost;
	}

}
