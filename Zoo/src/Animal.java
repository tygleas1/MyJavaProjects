import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Animal {

	private static int counter = 0;
	
	private int id;
	
	/**
	 * https://www.baeldung.com/java-string-to-date
	 * SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
	 * String dateInString = "7-Jun-2013";
	 * Date date = formatter.parse(dateInString);
	 */
	
	private Date birthdate;
	
	private final String type;
	
	private float weight;
	
	public Animal() {
		this.id = ++Animal.counter;
		this.type = "Animal";
		this.weight = 0;
		this.birthdate = null;
	}
	
	public Animal(Date birthdate, float weight) throws Exception {
		this();
		this.setBirthdate(birthdate);
		this.setWeight(weight);
	}
	
	public Animal(String birthdate, float weight) throws Exception {
		this();
		this.setBirthdate(birthdate);
		this.setWeight(weight);
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
		
	}
	
	public void setBirthdate(String birthdate) throws ParseException {
			SimpleDateFormat formatter = new SimpleDateFormat("MMM-dd-yyyy", Locale.ENGLISH);
			this.birthdate = formatter.parse(birthdate);
	}
	
	public void setWeight(float weight) throws Exception {
		
		if (weight <= 0)
			throw new Exception("Invalid weight: " + weight);
		else
			this.weight = weight;
	}
	
}
