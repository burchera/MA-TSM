import java.util.Scanner;

public class NAtchup {

	static Champion[] champions = new Champion[30];
	static Team[] teams = new Team[2];
	static Player[] players = new Player[5];
	static Champion currentChamp = champions[0];

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String input = "";

		champions[0] = new Champion("Urgot", "Top Lane", "Fighter", 68, "Powerspike at level 6");
		champions[1] = new Champion("Irelia", "Top Lane", "Fighter", 67, "Powerspike at level 6");
		champions[2] = new Champion("Maokai", "Top Lane", "Tank", 72, "Can and will outsustain you");
		champions[3] = new Champion("Ryze", "Top Lane", "Mage", 60, "Try not to take extended trades against them");
		champions[4] = new Champion("Kennen", "Top Lane", "Mage", 59, "Powerspike at level 6");
		champions[5] = new Champion("Vayne", "Top Lane", "Marksman", 66, "Try not to take extended trades against them");
		champions[6] = new Champion("Fiddlesticks", "Jungler", "Mage", 68, "Can and will outsustain you");
		champions[7] = new Champion("Hecarim", "Jungler", "Fighter", 72, "Try not to take extended trades against them");
		champions[8] = new Champion("Rammus", "Jungler", "Tank", 67, "Has incredible roaming potential");
		champions[9] = new Champion("Rengar", "Jungler", "Assassin", 70, "Powerspike at level 6");
		champions[10] = new Champion("Khazix", "Jungler", "Assassin", 73, "Try not to take extended trades against them");
		champions[11] = new Champion("Zac", "Jungler", "Tank", 64, "Can and will outsustain you");
		champions[12] = new Champion("Galio", "Mid Lane", "Fighter", 68, "Has incredible roaming potential");
		champions[13] = new Champion("Veigar", "Mid Lane", "Mage", 65, "Powerspike at level 6");
		champions[14] = new Champion("Diana", "Mid Lane", "Assassin", 59, "Powerspike at level 6");
		champions[15] = new Champion("Zed", "Mid Lane", "Assassin", 66, "Powerspike at level 6");
		champions[16] = new Champion("Corki", "Mid Lane", "Marksman", 58, "Has incredible roaming potential");
		champions[17] = new Champion("Syndra", "Mid Lane", "Mage", 57, "Powerspike at level 6");
		champions[18] = new Champion("Draven", "Bot Lane", "Marksman", 72, "Has great all-in potential");
		champions[19] = new Champion("Xayah", "Bot Lane", "Marksman", 70, "Try not to take extended trades against them");
		champions[20] = new Champion("Lucian", "Bot Lane", "Marksman", 63, "Has great all-in potential");
		champions[21] = new Champion("Ashe", "Bot Lane", "Marksman", 64, "Try not to take extended trades against them");
		champions[22] = new Champion("Jhin", "Bot Lane", "Marksman", 68, "Has great all-in potential");
		champions[23] = new Champion("Twitch", "Bot Lane", "Marksman", 65, "Powerspike at level 6");
		champions[24] = new Champion("Annie", "Support", "Mage", 58, "Powerspike at level 6");
		champions[25] = new Champion("Janna", "Support", "Enchanter", 65, "Try not to take extended trades against them");
		champions[26] = new Champion("Alistar", "Support", "Tank", 62, "Powerspike at level 6");
		champions[27] = new Champion("Pyke", "Support", "Assassin", 61, "Has great all-in potential");
		champions[28] = new Champion("Lulu", "Support", "Enchanter", 56, "Powerspike at level 6");
		champions[29] = new Champion("Leona", "Support", "Tank", 59, "Has great all-in potential");
		
		players[0] = new Player("TSM BrokenBlade", "Top Lane", "W/W/L/L/W");
		players[1] = new Player("TSM Akaadian", "Jungler", "W/L/W/L/W");
		players[2] = new Player("TSM Bjergsen", "Mid Lane", "W/W/L/W/W");
		players[3] = new Player("TSM Sven", "Bot Lane", "L/L/L/W/W");
		players[4] = new Player("TSM Smoothie", "Support", "W/L/L/L/L");
		
		
		System.out.println("Welcome to NAtchup");
		System.out.println("Which Champion are you playing?");
		while (players[0].getFillPos()==null) {
		input = keyboard.nextLine();
		if (input.equalsIgnoreCase("help")) {
			System.out.println("These are the available champions:");
			for (int i = 0; i < champions.length; i++) {
				System.out.println(champions[i].getName());
			}
			continue;
		} else {
			mainMenu(keyboard, input);
		}
	}
		System.out.println("What would you like to know?");
		input = keyboard.nextLine();
		if (input.equalsIgnoreCase("matchup")) {
			runMatchUp(currentChamp, teams[1]);
		}
		if (input.equalsIgnoreCase("players")) {
			checkPlayers(teams[1]);
		}
		if (input.equalsIgnoreCase("close")) {
			System.exit(0);
		}
	keyboard.close();
}

	public static void mainMenu(Scanner keyboard, String input) {
		
		
		for (int i = 0; i < champions.length; i++) {
			if (input.equalsIgnoreCase(champions[i].getName())) {
				buildTeam(champions[i].getPosition(), i, "Blue");
				teams[0].getAdc();
				currentChamp = champions[i];
				buildOppTeam();				
			}
		}
	}
	
	public static void buildTeam(String currentChamp, int index, String side) {
		if (currentChamp == "Top Lane") {
			teams[0] = new Team(side, champions[index],
					champions[randomNumber(6, 11)],
					champions[randomNumber(12, 17)],
					champions[randomNumber(18, 23)],
					champions[randomNumber(24, 29)]);
			teams[0].displayTeam();
		} else if (currentChamp == "Jungler") {
			teams[0] = new Team(side, champions[randomNumber(0, 5)],
					champions[index],
					champions[randomNumber(12, 17)],
					champions[randomNumber(18, 23)],
					champions[randomNumber(24, 29)]);
			teams[0].displayTeam();
		} else if (currentChamp == "Mid Lane") {
			teams[0] = new Team(side, champions[randomNumber(0, 5)],
					champions[randomNumber(6, 11)],
					champions[index],
					champions[randomNumber(18, 23)],
					champions[randomNumber(24, 29)]);
			teams[0].displayTeam();
		} else if (currentChamp == "Bot Lane") {
			teams[0] = new Team(side, champions[randomNumber(0, 5)],
					champions[randomNumber(6, 11)],
					champions[randomNumber(12, 17)],
					champions[index],
					champions[randomNumber(24, 29)]);
			teams[0].displayTeam();
		} else if (currentChamp == "Support") {
			teams[0] = new Team(side, champions[randomNumber(0, 5)],
					champions[randomNumber(6, 11)],
					champions[randomNumber(12, 17)],
					champions[randomNumber(18, 23)],
					champions[index]);
			teams[0].displayTeam();
		}
		
	}
	
	public static void buildOppTeam() {
		teams[1] = new Team("Red", champions[randomNumber(0, 5)],
				champions[randomNumber(6, 11)],
				champions[randomNumber(12, 17)],
				champions[randomNumber(18, 23)],
				champions[randomNumber(24, 29)]);
		setPlayers(teams[1]);
		teams[1].displayTeam();
		}

	private static void setPlayers(Team team) {
		team.getTop().setPlayer(players[0]);
		players[0].setCurrentRole(team.getTop());
		team.getJng().setPlayer(players[3]);
		players[3].setCurrentRole(team.getJng());
		team.getMid().setPlayer(players[2]);
		players[2].setCurrentRole(team.getMid());
		team.getAdc().setPlayer(players[4]);
		players[4].setCurrentRole(team.getAdc());
		team.getSupp().setPlayer(players[1]);
		players[1].setCurrentRole(team.getSupp());
	}

	private static int randomNumber(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		return (int) (Math.random() * ((max - min) + 1)) + min;
	}
	
	public static void runMatchUp(Champion currentChamp, Team oppTeam) {
		if (currentChamp.getPosition() == "Top Lane") {
			oppTeam.getTop().matchup();
		} else if (currentChamp.getPosition() == "Jungler") {
			oppTeam.getJng().matchup();
		} else if (currentChamp.getPosition() == "Mid Lane") {
			oppTeam.getMid().matchup();
		} else if (currentChamp.getPosition() == "Bot Lane") {
			oppTeam.getAdc().matchup();
		} else if (currentChamp.getPosition() == "Support") {
			oppTeam.getSupp().matchup();
		}
	}
	
	public static void checkPlayers(Team team) {
		teams[1].displayPlayers();
	}

}
