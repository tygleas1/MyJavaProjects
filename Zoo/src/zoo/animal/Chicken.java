package zoo.animal;

public class Chicken extends Bird implements Fly{

	/**
	 * 
	 */
	private final String type = "Chicken";
	
	/**
	 * 
	 */
	public Chicken() {
		super();
		
	}

	/**
	 * @param <T>
	 * @param birthdate
	 * @param weight
	 * @throws Exception
	 */
	public <T> Chicken(T birthdate, float weight) throws Exception {
		super(birthdate, weight);
	}
	
	/**
	 * @param <T>
	 * @param birthdate
	 * @param weight
	 * @param wingspan
	 * @throws Exception
	 */
	public <T> Chicken(T birthdate, float weight, float wingspan) throws Exception {
		super(birthdate, weight, wingspan);
	}

	/**
	 *
	 */
	@Override
	public String toString() {
		return this.id + " " + this.type;
	}
	
	/**
	 *
	 */
	@Override
	public void eat() {
		System.out.println("This" +this.type + " is eating...");
	}
	
	/**
	 *
	 */
	@Override
	public void soar() {
		System.out.println("This" +this.type + " is soaring...");
	}
	
	/**
	 *
	 */
	@Override
	public void glide() {
		System.out.println("This" +this.type + " is gliding...");
	}
	
	/**
	 *
	 */
	@Override
	public void takeoff() {
		System.out.println("This" +this.type + " is taking off...");
	}
	
	/**
	 *
	 */
	@Override
	public void land() {
		System.out.println("This" +this.type + " is landing...");
	}
}
