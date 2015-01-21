import java.util.Scanner;

public class ConsoleUI {
	//Controlled by the Game Master class.
	//Deals with all input and output involving the user.
	static Scanner consoleScanner = new Scanner(System.in);
	
	public void dieNumQuestion() {
		System.out.println("Yo brotha, how many dice you be needin'?");
		int userResponse = consoleScanner.nextInt();
		GameMaster.setDieNum(userResponse);
	}
	public void dieSideQuestion() {
		System.out.println("Yo brotha, how many sides does they has?");
		int userResponse = consoleScanner.nextInt();
		GameMaster.setDieSides(userResponse);
	}
	
	//Getters and Setters and things.
	
	//Getters and Setters and things end.
	
	
	public static void Output() {
		//Print out attributes.

		System.out.println("Would you like to re-roll your character?");
		System.out.println("Yes: 1");
		System.out.println("No: 2");
		int userResponse =  consoleScanner.nextInt();
		
		if (userResponse == 1) {
		//Create a new character with random properties.
		}
		else {
		//Keep the current character and store it.
			//Allow the user to enter a name for the hero.
			
		}
	}

}
