package assignment.core.qNo2;

public class Apple extends Mobile{

	public Apple(String manufacturer, String operating_system, String model, double cost) {
		super(manufacturer, operating_system, model, cost);
	}

	@Override
	public String getModel() {
		System.out.println("This is Apple class");
		return model;
	}

}
