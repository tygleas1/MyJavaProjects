import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Animal {

	private static int counter = 0;

	private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("MM-dd-yyyy", Locale.US);

	private int id;

	private final String type;

	private Gender gender;

	/**
	 * https://www.baeldung.com/java-creating-localdate-with-values
	 * https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
	 */	
	private LocalDate birthdate;

	private float weight;

	public Animal() {
		this.id = ++Animal.counter;
		this.type = "Animal";
		this.gender = Gender.UNKNOWN;
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
			return Animal.FORMAT.format(this.birthdate);
	}

	public Gender getGender() {
		return this.gender;
	}

	public String getType() {
		return this.getType();
	}

	public float getWeight() {
		return this.weight;
	}

	public <T> void setBirthdate(T birthdate) throws Exception {


		if (birthdate instanceof String) {

			this.birthdate = LocalDate.parse((String) birthdate, Animal.FORMAT);;
			/* or for readability:
				String s = (String) birthdate;
		    	this.birthdate = LocalDate.parse(s, Animal.FORMAT);; 
			 */

		} else if (birthdate instanceof LocalDate){

			LocalDate date = (LocalDate) birthdate;
			this.birthdate = date;

		} else {

			throw new Exception("Invalid date MM-dd-yyyy: " + birthdate);

		}

	}

	public <T> void setGender(T gender) throws Exception {

		if (gender instanceof String) {
			String s = (String) gender;

			s = s.toLowerCase();

			switch (s) {
			case "m":
			case "male":
				this.gender = Gender.MALE;
			case "f":
			case "female":
				this.gender = Gender.FEMALE;
				break;
			default:
				throw new Exception("Invalid gender: " + s);
			}
			
		} else if (gender instanceof Gender) {
			this.gender = (Gender) gender;
			
		} else {
			throw new Exception("Invalid gender: " + gender);
		}
	}

	public void setWeight(float weight) throws Exception {

		if (weight > 0)
			this.weight = weight;
		else
			throw new Exception("Invalid weight: " + weight);
	}

	@Override
	public String toString() {
		return this.id + " " + this.type;
	}

}
