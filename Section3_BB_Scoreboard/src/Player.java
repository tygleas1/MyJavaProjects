
public class Player {

	private String name;
	private int jersey;
	private int foul;
	private int fieldGoals_1pt;
	private int fieldGoals_2pt;
	private int fieldGoals_3pt;

	
	public Player() {
		this.name = "unknown";
		this.jersey = 0;
		this.foul = 0;
		this.fieldGoals_1pt = 0;
		this.fieldGoals_2pt = 0;
		this.fieldGoals_3pt = 0;

	}

	public Player(int jersey) throws Exception {
		this();
		
		try {
			this.setJersey(jersey);
		} catch (Exception e) {
			throw e;
		}
	}
	
	public Player(String name, int jersey) throws Exception {
		this();
		
		try {
			this.setName(name);
			this.setJersey(jersey);
		} catch (Exception e) {
			throw e;
		}

	}

	public int getFieldGoals_1pt() {
		return this.fieldGoals_1pt;
	}
	
	public int getFieldGoals_2pt() {
		return this.fieldGoals_2pt;
	}
	
	public int getFieldGoals_3pt() {
		return this.fieldGoals_3pt;
	}
	
	public int getFouls() {
		return this.foul;
	}
	
	public int getJersey() {
		return this.jersey;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPoints() {
		return this.fieldGoals_1pt + (this.fieldGoals_2pt * 2) + (this.fieldGoals_3pt * 3);
	}
	
	public void setJersey(int jersey) throws Exception {
		if (jersey >= 0 && jersey <= 99)
			this.jersey = jersey;
		else
			throw new Exception("Invalid jersey! Must be between 0-99");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void foul() {
		this.foul++;
	}
	
	public void shot(int shotType) throws Exception { 
		switch(shotType) {
		case 1:
			this.fieldGoals_1pt++;
			break;
		case 2:
			this.fieldGoals_2pt++;
			break;
		case 3:
			this.fieldGoals_3pt++;
			break;
			
		default:
			throw new Exception("Invalid shot type = " + shotType);
		}
	}
	
	public void displayStats() {
		System.out.println("#" + this.jersey + " " + this.name + " Fouls=" + this.foul + this.getPoints());
	}
	
	/**
	 * Instead of verifying two players are identical by equal identities
	 * This method will verify two players are the same by ONLY their jersey number
	 * This allows the ArrayList.getIndex() method to return a player's by only checking their jersey number
	 * @param object A player object to check equality of ONLY the jersey number
	 * @return True if the two player's jerseys are equal
	 */
	@Override
	public boolean equals(Object object) {
		
		if(!(object instanceof Player))
			return false;
		
		Player other = (Player)object;
		
		if (this.jersey == other.getJersey())
			return true;
		
		else
			return false;
	}

}
