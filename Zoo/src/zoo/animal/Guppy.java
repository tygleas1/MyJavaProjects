package zoo.animal;

public class Guppy extends Fish implements Swim{

	/**
	 * declares a the type of animal as "Guppy" as a string,
	 * will not be changed
	 */
	private final String type = "Guppy";
	
	/**
	 * declares guppy as inheritance
	 */
	public Guppy() {
		super();
		
	}

	/**
	 * @param <T>
	 * @param birthdate
	 * @param weight
	 * @throws Exception
	 * 
	 * initializes guppy to inherit a birthdate and weight
	 */
	public <T> Guppy(T birthdate, float weight) throws Exception {
		super(birthdate, weight);
	}
	
	/**
	 * @param <T>
	 * @param birthdate
	 * @param weight
	 * @param water
	 * @throws Exception
	 * 
	 * initializes guppy to inherit a birthdate, weight, and water
	 */
	public <T> Guppy(T birthdate, float weight, T water) throws Exception {
		super(birthdate, weight, water);
	}

	/**
	 * overrides the code to declare the species outside of main
	 */
	@Override
	public String toString() {
		return this.id + " " + this.type;
	}
	
	/**
	 * overrides the code to declare that the animal is eating
	 */
	@Override
	public void eat() {
		System.out.println("This" +this.type + " is eating...");
	}
	
	/**
	 * overrides the code to declare that the animal is propelling
	 */
	@Override
	public void propel() {
		System.out.println("This" +this.type + " is propelling...");
	}
	
	/**
	 * overrides the code to declare that the animal is drifting
	 */
	@Override
	public void drift() {
		System.out.println("This" +this.type + " is drifting...");
	}
	
}

