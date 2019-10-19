
public class Player {

	private String name;
	private String mainRole;
	private String currentRole;
	private String form;
	
	public Player (String name, String mainRole, String form) {
		this.name=name;
		this.mainRole=mainRole;
		this.form=form;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getMain() {
		return this.mainRole;
	}
	
	public String getFillPos() {
		return this.currentRole;
	}
	
	public String getForm() {
		return this.form;
	}
	
	public void setCurrentRole(Champion champion) {
		this.currentRole = champion.getPosition();
	}
}
