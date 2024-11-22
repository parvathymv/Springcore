package testproj.beans;

public class Player {
	private String playerName;
	private String country;
	private String skill;

	public Player() {
	}

	public Player(String playerName, String country, String skill) {

		this.playerName = playerName;
		this.country = country;
		this.skill = skill;
	}

	public Player(String playerName, String country) {

		this.playerName = playerName;
		this.country = country;

	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return String.format("Player [playerName=%s, country=%s, skill=%s]", playerName, country, skill);
	}

}
