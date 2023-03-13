
public class Street {

	private String name;
	private TrafficLight light1;
	private TrafficLight light2;
	
	public Street() {
		this.name = "unknown";
		this.light1 = new TrafficLight();
		this.light2 = new TrafficLight();
	}

	public Street(String name) {
		this();
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) throws Exception {
		name = name.trim();
		
		if (name.isEmpty()) {
			throw new Exception("Street name cannot be empty");
		}
		
		this.name = name;
	}

	public void redOn() {
		this.light1.redOn();
		this.light2.redOn();
	}

	public void yellowOn() {
		this.light1.yellowOn();
		this.light2.yellowOn();
	}

	public void greenOn() {
		this.light1.greenOn();
		this.light2.greenOn();
	}
	
	
	
}
