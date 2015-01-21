import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		//Prompt the user for their preferred operation.
		System.out.println("Welcome to the Fraction Calculator 9000!");
		System.out.println("Please choose an operation by typing the corresponding response.\n");
		System.out.println("	Reduce Fraction: 1	");
		System.out.println("	Do Fraction Math: 2");
		System.out.println("	Exit Application: 3\n");
		System.out.print("What would you like to do? ");
		
		Fraction frac = new Fraction();
		FractionMath selection = new FractionMath();
		
		//Scans for response from the user.
		Scanner responseScanner = new Scanner(System.in);
		int response = responseScanner.nextInt();
		
		//Chooses proper operation based on response.
		if (response ==  1) {
			System.out.println("You've chosen to reduce.");
			frac.ReduceStuff();
		}
		if (response ==  2) {
			System.out.println("You've chosen to do math.");
			selection.DoMath();
		}
		if (response ==  3) {
			System.out.println("Goodbye");
			System.exit(0);
		}
		
	}
		
}


