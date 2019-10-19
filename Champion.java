
public class Champion {

	private String name;
	private String pPosition;
	private String role;
	private int attackDamage;
	private String matchup;
	private Player player;

	public Champion(String name, String pPosition, String role, int attackDamage, String matchup) {
		this.name = name;
		this.pPosition = pPosition;
		this.role = role;
		this.attackDamage = attackDamage;
		this.matchup = matchup;
	}

	public String getName() {
		return this.name;
	}

	public String getPosition() {
		return this.pPosition;
	}

	public String getRole() {
		return this.role;
	}

	public int getAD() {
		return this.attackDamage;
	}

	public void matchup() {
		System.out.printf("%s\n %s \n", this.name, this.matchup);
	}
	
	public Player getPlayer() {
		return this.player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public void displayInfo() {
		System.out.printf("%s : %s : %s\n", this.name, this.pPosition, this.role);
	}

}
