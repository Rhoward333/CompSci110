
public class Player {
	private String playerName;
	private short rollTotal; 
	private short turnScore;
	private short playerBank;
	
	//Name
	public String getPlayerName() {
		if (playerName == null || playerName == "") {
			playerName = "Player 1";
			return playerName;
			}
			else return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	//Score for the turn.
	public short getTurnScore() {
		return turnScore;
	}
	public void setTurnScore(short turnScore) {
		this.turnScore = turnScore;
	}
	
	//Player bank score.
	public short getPlayerBank() {
		return playerBank;
	}
	public void setPlayerBank(short playerBank) {
		this.playerBank = playerBank;
	}
	
	//Total for each roll.
	public short getRollTotal() {
		return rollTotal;
	}

	public void setRollTotal(short rollTotal) {
		this.rollTotal = rollTotal;
	}
	
	
}
