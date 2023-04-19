package zoo.animal;

public abstract class Bird extends Animal {

	/**
	 * declares wingspan, cannot be accessed
	 */
	private float wingspan;
	
	/**
	 * declares a the type of animal as "Bird" as a string,
	 * will not be changed
	 */
	private final String type = "Bird";
	
	/**
	 * assigns a wingspan to bird
	 */
	public Bird() {
		super();
		this.wingspan = 0;
		
	}

	/**
	 * @param <T>
	 * @param birthdate
	 * @param weight
	 * @throws Exception
	 * 
	 * initializes bird to inherit a birthdate and weight
	 */
	public <T> Bird(T birthdate, float weight) throws Exception {
		super(birthdate, weight);
	}
	
	/**
	 * @param <T>
	 * @param birthdate
	 * @param weight
	 * @param wingspan
	 * @throws Exception
	 * 
	 * initializes bird to inherit a birthdate, weight, and wingspan
	 */
	
	public <T> Bird(T birthdate, float weight, float wingspan) throws Exception {
		super(birthdate, weight);
		this.wingspan = wingspan;
	}

	/**
	 * @return
	 * 
	 * gets and returns wingspan
	 */
	public float getWingspan() {
		return wingspan;
	}

	/**
	 * @param wingspan
	 * @throws Exception
	 * 
	 * sets wingspan, displays an error if the float is invalid
	 */
	public void setWingspan(float wingspan) throws Exception {
		
		if (wingspan > 0)
			this.wingspan = wingspan;
		else
			throw new Exception("Invalid wingspan: " + wingspan);
	}
	
	/**
	 *overrides the code to declare the species outside of main
	 */
	@Override
	public String toString() {
		return this.id + " " + this.type;
	}
	
}
