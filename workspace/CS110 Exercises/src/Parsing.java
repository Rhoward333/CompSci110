import java.util.Scanner;

public class Parsing {

	public static void main(String[] args) {
		//Prompt the user for a number.
			//You MUST use parsing for this.
		//You must tell the user the smallest data type that holds that number.
		
	System.out.print("Enter an integer, please.");
	Scanner input = new Scanner(System.in);
	String response = input.nextLine();
	//int convertedResponse = Integer.parseInt(response);
	
	try {
		int convertedResponse = Integer.parseInt(response);
		System.out.println("Your number is " + convertedResponse);}
	catch (NumberFormatException nfe) {
		System.out.println("Uh oh! You suck at numbers.");}
	
	if (convertedResponse <= 127); {
	
	}
		
		
	}

}
