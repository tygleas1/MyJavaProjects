import java.util.ArrayList;
import java.util.List;

public class Team {

	private String name;
	private List<Player> players;
	
	public Team() {

		this.name = "unknown";
		this.players = new ArrayList<Player>();
	}

	public Team(String name) {
		
		this();
		this.setName(name);
	}
	
	public void addPlayer(String name, int jersey) throws Exception {
		Player dup = this.getPlayer(jersey);
		
		if (dup == null) {
			//Player newPlayer = new Player(name, jersey);
			this.players.add(new Player(name, jersey));
		}
		
		else {
			// jersey #.. already assigned to ...
			throw new Exception("Jersey #" + jersey + " already assigned to " + dup.getName());
		}
	}
	
	public Player getPlayer(int jersey) throws Exception {
		
		int index = this.players.indexOf(new Player(jersey));
		
		if (index == -1)
			return null;
		else
			return this.players.get(index);
	}
	
	public int getTeamFouls() {
		
		int totalFouls = 0;
		
		for(int i = 0; i < this.players.size(); ++i) {
			totalFouls += this.players.get(i).getFouls();
		}
		
		return totalFouls;
	}
	
	public int getTeamPoints() {
		
		int totalPoints = 0;
		
		for(int i = 0; i < this.players.size(); ++i) {
			totalPoints += this.players.get(i).getPoints();
		}
		
		return totalPoints;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Jersey Name            Fouls 1pt 2pt 3pt Total
     * ====== =============== ===== === === === =====
     *     10 Kitty               0   0   0   1     3
     *     20 Tabby               0   0   0   0     0
	 */
	public void displayDetailStats() {
		
		//display the header lines
		System.out.println("Jersey Name            Fouls 1pt 2pt 3pt Total");
		System.out.println("====== =============== ===== === === === =====");
		
		for (int i = 0; i < this.players.size(); i++) {
			
			int jersey = players.get(i).getJersey();
			String name = players.get(i).getName();
			int foul = players.get(i).getFouls();
			int fieldGoals_1pt = players.get(i).getFieldGoals_1pt();
			int fieldGoals_2pt = players.get(i).getFieldGoals_2pt();
			int fieldGoals_3pt = players.get(i).getFieldGoals_3pt();
			int points = players.get(i).getPoints();
			
			System.out.printf("%6d %15s %5d %3d %3d %3d %5d\n", jersey, name, foul, fieldGoals_1pt, fieldGoals_2pt, fieldGoals_3pt, points);
		}
		
	}
		
	// Team Cat Fouls=0 Points=3	
	public void displayTeamStats() {
		System.out.println("Team " + this.name + " Fouls=" + this.getTeamFouls());
	}
	
}
