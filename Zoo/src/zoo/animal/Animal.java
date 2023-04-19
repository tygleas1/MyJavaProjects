package zoo.animal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Animal {

	/**
	 * counts the number of animals, cannot be altered outside of this class,
	 * works as such across every class
	 */
	private static int counter = 0;

	/**
	 * formats the date as Month-Day-Year, cannot be altered outside of this 
	 * class, works like this across every class, declared as final because it won't
	 * be changed again in this class
	 */
	protected static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("MM-dd-yyyy", Locale.US);

	/**
	 * declares animal id, cannot be altered outside of this class
	 * declared as final because it won't be changed again in this class
	 */
	protected final int id;

	/**
	 * declares a type of string as "Animal", cannot be changed
	 * outside of this class, declared as final because it won't
	 * be changed again in this class
	 */
	protected final String type = "Animal";

	/**
	 * declares a Gender (which is an enum) known as gender
	 */
	protected Gender gender;

	/**
	 * https://www.baeldung.com/java-creating-localdate-with-values
	 * https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
	 */	
	/**
	 * declares a date as birthdate, will be used for animals,
	 * cannot be accessed outside of this class
	 */
	private LocalDate birthdate;

	/**
	 * declares weight, cannot be accessed outside of this class
	 */
	private float weight;

	/**
	 * initialized Animal, temporarily setting id, gender,
	 * birthdate, and weight
	 */
	public Animal() {
		this.id = ++Animal.counter;
		this.gender = Gender.UNKNOWN;
		this.birthdate = null;
		this.weight = 0;
	}

	/**
	 * @param <T>
	 * @param birthdate
	 * @param weight
	 * @throws Exception
	 * 
	 * initializes Animal, specifically sets birthdate and weight
	 * provides an exception should an error occur
	 */
	public <T> Animal(T birthdate, float weight) throws Exception {
		this();
		this.setBirthdate(birthdate);
		this.setWeight(weight);
	}

	/**
	 * @return
	 * 
	 * gets and returns the animal id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * @return
	 * 
	 * gets and returns the animal birthdate
	 */
	public LocalDate getBirthdate() {
		return this.birthdate;
	}

	/**
	 * @return
	 * 
	 * gets and returns the animal birthdate, if there is no birthdate,
	 * returns "unknown"
	 */
	public String getBirthdateStr() {
		if (this.birthdate == null)
			return "unknown";
		else
			return Animal.FORMAT.format(this.birthdate);
	}

	/**
	 * @return
	 * 
	 * gets and returns the animal gender
	 */
	public Gender getGender() {
		return this.gender;
	}

	/**
	 * @return
	 * 
	 * gets and returns the animal type, or species
	 */
	public String getType() {
		return this.getType();
	}

	/**
	 * @return
	 * 
	 * gets and returns the animal weight
	 */
	public float getWeight() {
		return this.weight;
	}

	/**
	 * @param <T>
	 * @param birthdate
	 * @throws Exception
	 * 
	 * sets the animal birthdate as a string, provides an exception
	 * if an error occurs while displaying the string
	 */
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

	/**
	 * @param <T>
	 * @param gender
	 * @throws Exception
	 * 
	 * sets the animal gender, provides an exception if an
	 * error occurs, while displaying the gender
	 */
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

	/**
	 * @param weight
	 * @throws Exception
	 * 
	 * sets the animal weight, displays the weight
	 * if an error occurs and is not valid
	 */
	public void setWeight(float weight) throws Exception {

		if (weight > 0)
			this.weight = weight;
		else
			throw new Exception("Invalid weight: " + weight);
	}

	/**
	 *overrides the code to declare the species outside of main
	 */
	@Override
	public String toString() {
		return this.id + " " + this.type;
	}

	/**
	 * calls a lower declared eat function
	 */
	abstract public void eat();	
	
}
