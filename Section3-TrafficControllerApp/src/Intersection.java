
public class Intersection {

	private Street street1;
	private Street street2;
	
	public Intersection() {
		this.street1 = new Street();
		this.street2 = new Street();
	}

	public Intersection(String name1, String name2) {
		this();
		try {
			this.street1.setName(name1);
			this.street2.setName(name2);
		} catch (Exception e) {
			System.out.println("Unable to set street names");
		}
	}// end of overload constructor
	
}// end of class
