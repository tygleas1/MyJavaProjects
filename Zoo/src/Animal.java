import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Animal {

	private static int counter = 0;
	
	private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("MM-dd-yyyy", Locale.US);

	private int id;
	
	private final String type;
	
	/**
	 * https://www.baeldung.com/java-creating-localdate-with-values
	 * https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
	 */	
	private LocalDate birthdate;
	
	private float weight;
	
	public Animal() {
		this.type = "Animal";
		this.id = ++Animal.counter;
		this.birthdate = null;
		this.weight = 0;
	}
	
	public <T> Animal(T birthdate, float weight) throws Exception {
		this();
		this.setBirthdate(birthdate);
		this.setWeight(weight);
	}

	public int getId() {
		return this.id;
	}
	
	public LocalDate getBirthdate() {
		return this.birthdate;
	}

	public String getBirthdateStr() {
		if (this.birthdate == null)
			return "unknown";
		else
			return this.FORMAT.format(this.birthdate);
	}
	
	public String getType() {
		return this.getType();
	}
	
	public float getWeight() {
		return this.weight;
	}
	
	public <T> void setBirthdate(T birthdate) throws Exception {


		if (birthdate instanceof String) {
			
			String date = (String) birthdate;
		    this.birthdate = LocalDate.parse(date, this.FORMAT);;
		    
		} else if (birthdate instanceof LocalDate){
			
			LocalDate date = (LocalDate) birthdate;
			this.birthdate = date;
			
		} else {
			
			throw new Exception("Invalid date MM-dd-yyyy: " + birthdate);
			
		}
			
	}
	
	public void setWeight(float weight) throws Exception {
		
		if (weight > 0)
			this.weight = weight;
		else
			throw new Exception("Invalid weight: " + weight);
	}

}
