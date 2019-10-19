
public class Team {

	private String side;
	private Champion top;
	private Champion jng;
	private Champion mid;
	private Champion adc;
	private Champion supp;

	public Team(String side, Champion top, Champion jng, Champion mid, Champion adc, Champion supp) {
		this.side = side;
		this.top = top;
		this.jng = jng;
		this.mid = mid;
		this.adc = adc;
		this.supp = supp;
	}

	public void displayTeam() {
		System.out.printf("%s Team\n Top: %s\n Jungle: %s\n Mid: %s\n ADC: %s\n Support: %s\n", this.side,
				this.top.getName(), this.jng.getName(), this.mid.getName(), this.adc.getName(), this.supp.getName());
	}
	
	public void displayPlayers() {
		System.out.printf("%s Team Players: \nTop: %s\n They are a %s main\n",this.side, this.top.getPlayer().getName(), this.top.getPlayer().getMain());
		System.out.printf("\nJungler: %s\n They are a %s main\n", this.jng.getPlayer().getName(), this.jng.getPlayer().getMain());
		System.out.printf("\nMid: %s\n They are a %s main\n", this.mid.getPlayer().getName(), this.mid.getPlayer().getMain());
		System.out.printf("\nADC: %s\n They are a %s main\n", this.adc.getPlayer().getName(), this.adc.getPlayer().getMain());
		System.out.printf("\nSupport: %s\n They are a %s main\n", this.supp.getPlayer().getName(), this.supp.getPlayer().getMain());
	}

	public Champion getTop() {
		return this.top;
	}

	public Champion getJng() {
		return this.jng;
	}

	public Champion getMid() {
		return this.mid;
	}

	public Champion getAdc() {
		return this.adc;
	}

	public Champion getSupp() {
		return this.supp;
	}
}
