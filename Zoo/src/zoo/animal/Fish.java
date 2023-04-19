package zoo.animal;

public abstract class Fish extends Animal {

	/**
	 * declares the type of water the fish is in, 
	 * cannot be accessed outside of this code
	 */
	protected Water water;
	
	/**
	 * declares a the type of animal as "fish" as a string,
	 * will not be changed
	 */
	protected final String type = "fish";
	
	/**
	 * assigns a water type to fish, set to unknown
	 */
	public Fish() {
		super();
		this.water = Water.UNKNOWN;
		
	}

	/**
	 * @param <T>
	 * @param birthdate
	 * @param weight
	 * @throws Exception
	 * 
	 * initializes the fish to inherit birthdate and weight
	 */
	public <T> Fish(T birthdate, float weight) throws Exception {
		super(birthdate, weight);
	}
	
	/**
	 * @param <T>
	 * @param birthdate
	 * @param weight
	 * @param water
	 * @throws Exception
	 * 
	 * initializes fish to inherit a birthdate, weight, and water type
	 */
	public <T> Fish(T birthdate, float weight, T water) throws Exception {
		super(birthdate, weight);
		this.setWater(water);
	}

	/**
	 * @return
	 * 
	 * gets and return water
	 */
	public Water getWater() {
		return this.water;
	}

	/**
	 * @param <T>
	 * @param water
	 * @throws Exception
	 * 
	 * sets water, displays an error if the enum is invalid
	 */
	public <T> void setWater(T water) throws Exception {
		
		//finish this
		if (water instanceof String) {
			
			String s = (String) water;
			
			s = s.toLowerCase();
			
			switch (s) {
			case "s":
			case "salt":
			case "saltwater":
					this.water = Water.SALT;
					break;
			case "f":
			case "fresh":
			case "freshwater":
				this.water = Water.FRESH;
				break;
			default:
				this.water = Water.UNKNOWN;
				
			}
		} else if (water instanceof Water) {
			Water w = (Water) water;
			this.water = w;
		} else {
			throw new Exception("Invalid water: " + water);
		}
	}
	
	/**
	 *overrides the code to declare the species outside of main
	 */
	@Override
	public String toString() {
		return this.id + " " + this.type;
	}
	
}
