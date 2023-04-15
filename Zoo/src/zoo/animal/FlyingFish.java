package zoo.animal;

public class FlyingFish extends Fish implements Fly {

	private final String type = "Flying Fish";
	
	public FlyingFish() {
		super();
		
	}

	public <T> FlyingFish(T birthdate, float weight) throws Exception {
		super(birthdate, weight);
	}
	
	public <T> FlyingFish(T birthdate, float weight, T water) throws Exception {
		super(birthdate, weight, water);
	}

	@Override
	public String toString() {
		return this.id + " " + this.type;
	}
	
	@Override
	public void eat() {
		System.out.println("This" +this.type + " is eating...");
	}

	@Override
	public void soar() {
		System.out.println("This" +this.type + " is soaring...");
		
	}

	@Override
	public void glide() {
		System.out.println("This" +this.type + " is gliding...");
		
	}

	@Override
	public void takeoff() {
		System.out.println("This" +this.type + " is taking off...");
		
	}

	@Override
	public void land() {
		System.out.println("This" +this.type + " is landing...");
		
	}
	
	@Override
	public void propel() {
		System.out.println("This" +this.type + " is propelling...");
	}
	
	@Override
	public void drift() {
		System.out.println("This" +this.type + " is drifting...");
	}
	
}

