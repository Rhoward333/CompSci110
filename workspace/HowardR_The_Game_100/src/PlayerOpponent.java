import java.util.Scanner;

public class PlayerOpponent {
	Scanner playerScanner = new Scanner(System.in);
	Scanner menuDecider = new Scanner(System.in);
	Dice dice1 = new Dice();
	Dice dice2 = new Dice();
	boolean firstPlayer = true;
	boolean secondPlayer = false;
	int player1TurnScore;
	int player2TurnScore;
	static int player1Bank = 0;
	static int player2Bank = 0;
	
	
	//Encapsulation Stuff
	public Scanner getPlayerScanner() {
		return playerScanner;
	}

	public void setPlayerScanner(Scanner playerScanner) {
		this.playerScanner = playerScanner;
	}

	public int getPlayer1TurnScore() {
		return player1TurnScore;
	}

	public void setPlayer1TurnScore(int player1TurnScore) {
		this.player1TurnScore = player1TurnScore;
	}

	public int getPlayer2TurnScore() {
		return player2TurnScore;
	}

	public void setPlayer2TurnScore(int player2TurnScore) {
		this.player2TurnScore = player2TurnScore;
	}

	public static int getPlayer1Bank() {
		return player1Bank;
	}

	public void setPlayer1Bank(int player1Bank) {
		this.player1Bank = player1Bank;
	}

	public static int getPlayer2Bank() {
		return player2Bank;
	}

	public void setPlayer2Bank(int player2Bank) {
		this.player2Bank = player2Bank;
	}

	public boolean isFirstPlayer() {
		return firstPlayer;
	}

	public void setFirstPlayer(boolean firstPlayer) {
		this.firstPlayer = firstPlayer;
	}

	public boolean isSecondPlayer() {
		return secondPlayer;
	}

	public void setSecondPlayer(boolean secondPlayer) {
		this.secondPlayer = secondPlayer;
	}
	//Encapsulation Stuff Ends
	
	//First Player's Turn
	public void Player1Turn() {
		System.out.println("\nPlayer 1's Turn");
		//Roll
		dice1.rollStuff();
		dice2.rollStuff();
		//Print Results
		int totalRoll = dice1.getDice() + dice2.getDice();
		System.out.println("First Die: " + dice1.getDice());
		System.out.println("Second Die: " + dice2.getDice());
		System.out.println("Both Dice: " + totalRoll);
		System.out.println("Turn Score: " + (getPlayer1TurnScore() + totalRoll));
		setPlayer1TurnScore(getPlayer1TurnScore() + totalRoll);
		System.out.println("Banked Points: " + getPlayer1Bank());
		
		if (dice1.getDice() == 1 || dice2.getDice() == 1) {
			System.out.println("You rolled a one, so your turn is over. Huehuehue");
			setPlayer1TurnScore(0);
			Player2Turn();
		}
		if (dice1.getDice() == 1 && dice2.getDice() == 1) {
			System.out.println("You rolled Snake-Eyes. All your bank are belong to me!");
			setPlayer1TurnScore(0);
			setPlayer1Bank(0);
			Player2Turn();
		}
		
		else { 
		System.out.println("Would you like bank your points or continue rolling?");
		System.out.println("Keep On Rollin': 1");
		System.out.println("Bank My Points: 2");
		int turnDecider = menuDecider.nextInt();
		if (turnDecider == 1) {
			Player1Turn();
		}
		if (turnDecider == 2) {
			setPlayer1Bank(getPlayer1Bank() + getPlayer1TurnScore());
			Player2Turn();
			}
		}
	}
	
	public void Player2Turn() {
		System.out.println("\nPlayer 2's Turn");
		//Roll
		dice1.rollStuff();
		dice2.rollStuff();
		//Print Results
		int totalRoll = dice1.getDice() + dice2.getDice();
		System.out.println("First Die: " + dice1.getDice());
		System.out.println("Second Die: " + dice2.getDice());
		System.out.println("Total Value: " + totalRoll);
		System.out.println("Turn Value: " + (getPlayer2TurnScore() + totalRoll));
		setPlayer2TurnScore(getPlayer2TurnScore() + totalRoll);
		System.out.println("Banked Points: " + getPlayer2Bank());
		
		if (dice1.getDice() == 1 || dice2.getDice() == 1) {
			System.out.println("You rolled a one, so your turn is over. Huehuehue");
			setPlayer2TurnScore(0);
		}
		if (dice1.getDice() == 1 && dice2.getDice() == 1) {
			System.out.println("You rolled Snake-Eyes. All your bank are belong to me!");
			setPlayer2TurnScore(0);
			setPlayer2Bank(0);
			Player2Turn();
		}
		
		else { 
		System.out.println("Would you like bank your points or continue rolling?");
		System.out.println("Keep On Rollin': 1");
		System.out.println("Bank My Points: 2");
		int turnDecider = menuDecider.nextInt();
		if (turnDecider == 1) {
			Player2Turn();
		}
		if (turnDecider == 2) {
			setPlayer2Bank(getPlayer2Bank() + getPlayer2TurnScore());
			Player1Turn();
			}
		}
	}
}
	
	
