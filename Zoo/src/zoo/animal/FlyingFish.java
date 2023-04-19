package zoo.animal;

public class FlyingFish extends Fish implements Fly, Swim{

	/**
	 * declares a the type of animal as "Flying Fish" as a string,
	 * will not be changed
	 */
	private final String type = "Flying Fish";
	
	/**
	 * declares flying fish as inheritance
	 */
	public FlyingFish() {
		super();
		
	}

	/**
	 * @param <T>
	 * @param birthdate
	 * @param weight
	 * @throws Exception
	 * 
	 * initializes flying fish to inherit a birthdate and weight
	 */
	public <T> FlyingFish(T birthdate, float weight) throws Exception {
		super(birthdate, weight);
	}
	
	/**
	 * @param <T>
	 * @param birthdate
	 * @param weight
	 * @param water
	 * @throws Exception
	 * 
	 * initializes flying fish to inherit a birthdate, weight, and water
	 */
	public <T> FlyingFish(T birthdate, float weight, T water) throws Exception {
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
	 * overrides the code to declare that the animal is soaring
	 */
	@Override
	public void soar() {
		System.out.println("This" +this.type + " is soaring...");
		
	}

	/**
	 * overrides the code to declare that the animal is gliding
	 */
	@Override
	public void glide() {
		System.out.println("This" +this.type + " is gliding...");
		
	}

	/**
	 * overrides the code to declare that the animal is taking off
	 */
	@Override
	public void takeoff() {
		System.out.println("This" +this.type + " is taking off...");
		
	}

	/**
	 * overrides the code to declare that the animal is landing
	 */
	@Override
	public void land() {
		System.out.println("This" +this.type + " is landing...");
		
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

