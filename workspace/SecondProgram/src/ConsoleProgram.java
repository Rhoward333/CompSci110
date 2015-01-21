import java.util.Scanner;

public class ConsoleProgram {
	

	public static void main(String[] args) {
		//Prompt the user to enter his/her name
		System.out.print ("Enter your name: ");
		
		Scanner scanLee = new Scanner(System.in);
		String response = scanLee.nextLine ();
		System.out.println ("Hello, " + response + "!\n");
	
		//Prompt the user for his/her age in years
		
		//Print out "You are [age] years old.
		System.out.print ("Enter your age: ");
		
		Scanner ageScanner = new Scanner(System.in);
		String ageResponse = ageScanner.nextLine ();
		System.out.print ("You are " + ageResponse + " years old.");
		
	}

}
