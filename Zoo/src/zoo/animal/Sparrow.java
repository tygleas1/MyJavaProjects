package zoo.animal;

public class Sparrow extends Bird implements Fly{

	/**
	 * declares a the type of animal as "Sparrow" as a string,
	 * will not be changed
	 */
	protected final String type = "Sparrow";
	
	/**
	 * declares sparrow as inheritance
	 */
	public Sparrow() {
		super();
		
	}

	/**
	 * @param <T>
	 * @param birthdate
	 * @param weight
	 * @throws Exception
	 * 
	 * initializes sparrow to inherit a birthdate and weight
	 */
	public <T> Sparrow(T birthdate, float weight) throws Exception {
		super(birthdate, weight);
	}
	
	/**
	 * @param <T>
	 * @param birthdate
	 * @param weight
	 * @param wingspan
	 * @throws Exception
	 * 
	 * initializes sparrow to inherit a birthdate, weight, and wingspan
	 */
	public <T> Sparrow(T birthdate, float weight, float wingspan) throws Exception {
		super(birthdate, weight, wingspan);
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
	
}
