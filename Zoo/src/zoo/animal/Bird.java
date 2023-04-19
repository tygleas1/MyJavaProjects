package zoo.animal;

public abstract class Bird extends Animal {

	/**
	 * 
	 */
	private float wingspan;
	
	/**
	 * 
	 */
	private final String type = "Bird";
	
	/**
	 * 
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
	 */
	public <T> Bird(T birthdate, float weight, float wingspan) throws Exception {
		super(birthdate, weight);
		this.wingspan = wingspan;
	}

	/**
	 * @return
	 */
	public float getWingspan() {
		return wingspan;
	}

	/**
	 * @param wingspan
	 * @throws Exception
	 */
	public void setWingspan(float wingspan) throws Exception {
		
		if (wingspan > 0)
			this.wingspan = wingspan;
		else
			throw new Exception("Invalid wingspan: " + wingspan);
	}
	
	/**
	 *
	 */
	@Override
	public String toString() {
		return this.id + " " + this.type;
	}
	
}
