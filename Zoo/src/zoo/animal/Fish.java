package zoo.animal;

public abstract class Fish extends Animal {

	protected Water water;
	
	protected final String type = "fish";
	
	public Fish() {
		super();
		this.water = Water.UNKNOWN;
		
	}

	public <T> Fish(T birthdate, float weight) throws Exception {
		super(birthdate, weight);
	}
	
	public <T> Fish(T birthdate, float weight, T water) throws Exception {
		super(birthdate, weight);
		this.setWater(water);
	}

	// fix this
	public Water getWater() {
		return this.water;
	}

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
	
	@Override
	public String toString() {
		return this.id + " " + this.type;
	}
	
}
