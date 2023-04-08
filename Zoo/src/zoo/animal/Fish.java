package zoo.animal;

public class Fish extends Animal{

private Water water;
	
	private final String type = "Fish";
	
	public Fish() {
		super();
		this.water = Water.UNKNOWN;
		
	}

	public <T> Fish(T birthdate, float weight) throws Exception {
		super(birthdate, weight);
	}
	
	public <T> Fish(T birthdate, float weight, Water water) throws Exception {
		super(birthdate, weight);
		this.water = Water.UNKNOWN;
	}

	// fix this
	public float getWater() {
		return water;
	}

	public void setWater(Water water) throws Exception {
		
		//finish this
		if (water > )
			this.water = Water.UNKNOWN;
		else
			throw new Exception("Invalid water type: " + water);
	}
	
	@Override
	public String toString() {
		return this.id + " " + this.type;
	}
	
}
