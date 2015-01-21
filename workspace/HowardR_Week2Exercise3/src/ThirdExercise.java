import java.util.Scanner;

public class ThirdExercise {

	public static void main(String[] args) {
	//Make the user guess a number.
		//Base the guess against the true value.
		//Tell the player if they were close or not.
		//Number must be between 1 and 25.
		//Should loop until the game is over.
		
		int guessCounter = 1;
		System.out.println("Welcome to the number guessing game!");
		System.out.println("Please enter a number between 1 and 25");
		Scanner userGuess = new Scanner(System.in);
		int answer = 7;
		boolean continuing = true;
		
		//Continue loop starts here.
		while (continuing) {
			System.out.print("Guess #" + guessCounter + ": " );
			String response = userGuess.nextLine();
			//int response = Integer.parseInt(userParsed);
			int trueNum = -5;
			
			try {
				trueNum = Integer.parseInt(response);
				System.out.println("Your number is " + response);}
			catch (NumberFormatException nfe) {
				System.out.println("Uh oh! You suck at numbers.");}
			
			guessCounter = (guessCounter + 1); 
			
			
			if (trueNum > answer) { 
				System.out.println("You're shooting a little high.");}
			if (trueNum < answer && trueNum != -5) {
				System.out.println("You're a bit low.");}
			if (trueNum == answer) {
				System.out.println("CONGRATULATIONS!!! The answer was " + answer + "." + "\nYour parents must be proud.");
				continuing = false;}
			if (trueNum < 1 || trueNum > 25) {
				System.out.println("You must enter a number between 1 and 25.");}
		
		
}
	}
		}