package assignment.core.qNo2;

public class Android extends Mobile{

	public Android(String manufacturer, String operating_system, String model, double cost) {
		super(manufacturer, operating_system, model, cost);
	}
	
	@Override
	public String getModel() {
		System.out.println("This is Android class");
		return model;
	}

}
