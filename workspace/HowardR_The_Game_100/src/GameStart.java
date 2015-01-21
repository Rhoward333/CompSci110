import java.util.Scanner;

public class GameStart {
	
	public GameStart() {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Welcome to the game 100.");
		System.out.println("Play against a human: 1");
		System.out.println("Play against the computer: 2");
		System.out.println("Take me to the main menu: 3");
		Byte userInput = inputScanner.nextByte();
		
		
		//User fights another player. To the death...
		if (userInput == 1) {
			System.out.println("You've chosen to fight a human.");
			PlayerOpponent playerFights = new PlayerOpponent();	
			while (PlayerOpponent.getPlayer1Bank() < 100 && PlayerOpponent.getPlayer2Bank() < 100) {
			playerFights.Player1Turn();
			playerFights.Player2Turn();
		}
			
		}
		
		//User fights the computer. To the death...
		if (userInput == 2) {
			System.out.println("You've chosen to fight the computer.");
		}
		
		//Returns user to the main menu.
		if (userInput == 3) {
			System.out.println("You've returned to the main menu.");
			GameMain.run();
		}
		
	}
}
