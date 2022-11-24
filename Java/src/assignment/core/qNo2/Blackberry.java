package assignment.core.qNo2;

public class Blackberry extends Mobile{

	public Blackberry(String manufacturer, String operating_system, String model, double cost) {
		super(manufacturer, operating_system, model, cost);
	}

	@Override
	public String getModel() {
		System.out.println("This is Blackberry class");
		return model;
	}

}
