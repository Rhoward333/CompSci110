import java.util.Scanner;

public class MoarSwitchesAndStuff {

	public static void main(String[] args) {
		System.out.println("Please enter your choice.");
		System.out.println("1. Play Solitaire");
		System.out.println("2. Play Super Mario Bros.");
		System.out.println("3. Quit");
		System.out.print("Your choice: ");
		Scanner userInput = new Scanner(System.in);
		int input =  userInput.nextInt ();
		
		switch (input){ 
		case 1 :
		String	response = "You chose to play Solitaire.";
		System.out.println(response);
		break;
		
		case 2 :
		response = "You chose to play Super Mario Bros.";
		System.out.println(response);
		break;
		
		case 3 :
		response = "You chose to quit.";
		System.out.println(response);	
		break;
		
		default: 
		response = "Nope";
			System.out.println(response);
		}

	}

}
