import java.util.Scanner;

public class FractionMath {

	public void DoMath() {
		System.out.println("	Add Fractions: 1	");
		System.out.println("	Subtract Fractions: 2	");
		System.out.println("	Multiply Fractions: 3	");
		System.out.println("	Divide Fractions: 4	");
		System.out.println("	Main Menu: 5	");
		System.out.println("	Exit Application: 6	");
		
		Scanner userInput = new Scanner(System.in);
		int response = userInput.nextInt();
		CalculatorMain call = new CalculatorMain();
		
		if (response ==  1) {
			System.out.println("You've chosen to add.");
			//First Fraction
			
			System.out.println("Enter the numerator of your first fraction");
			int firstNumerator = userInput.nextInt();
			System.out.println("Enter the denominator of your first fraction");
			int firstDenominator = userInput.nextInt();
			System.out.println("Enter the numerator of your second fraction");
			int secondNumerator = userInput.nextInt();
			System.out.println("Enter the denominator of your second fraction");
			int secondDenominator = userInput.nextInt();
			
			int totalDenominator = firstDenominator * secondDenominator;
			int firstNumeratorMult = firstNumerator * secondDenominator;
			int secondNumeratorMult = secondNumerator * firstDenominator;
			int totalNumerator = firstNumeratorMult + secondNumeratorMult;
			System.out.println("Your answer is: " + totalNumerator + "/" + totalDenominator);
			
		}
		if (response ==  2) {
			System.out.println("You've chosen to subtract.");	
			
			
			System.out.println("Enter the numerator of your first fraction");
			int firstNumerator = userInput.nextInt();
			System.out.println("Enter the denominator of your first fraction");
			int firstDenominator = userInput.nextInt();
			System.out.println("Enter the numerator of your second fraction");
			int secondNumerator = userInput.nextInt();
			System.out.println("Enter the denominator of your second fraction");
			int secondDenominator = userInput.nextInt();
			
			int totalDenominator = firstDenominator * secondDenominator;
			int firstNumeratorMult = firstNumerator * secondDenominator;
			int secondNumeratorMult = secondNumerator * firstDenominator;
			int totalNumerator = firstNumeratorMult - secondNumeratorMult;
			System.out.println("Your answer is: " + totalNumerator + "/" + totalDenominator);
		}
		if (response ==  3) {
			System.out.println("You've chosen to multiply.");
			System.out.println("Enter the numerator of your first fraction");
			int firstNumerator = userInput.nextInt();
			System.out.println("Enter the denominator of your first fraction");
			int firstDenominator = userInput.nextInt();
			System.out.println("Enter the numerator of your second fraction");
			int secondNumerator = userInput.nextInt();
			System.out.println("Enter the denominator of your second fraction");
			int secondDenominator = userInput.nextInt();
			
			int totalDenominator = firstDenominator * secondDenominator;
			int firstNumeratorMult = firstNumerator * secondDenominator;
			int secondNumeratorMult = secondNumerator * firstDenominator;
			int totalNumerator = firstNumeratorMult * secondNumeratorMult;
			System.out.println("Your answer is: " + totalNumerator + "/" + totalDenominator);
		}
		if (response ==  4) {
			System.out.println("You've chosen to divide.");	
			System.out.println("Enter the numerator of your first fraction");
			int firstNumerator = userInput.nextInt();
			System.out.println("Enter the denominator of your first fraction");
			int firstDenominator = userInput.nextInt();
			System.out.println("Enter the numerator of your second fraction");
			int secondNumerator = userInput.nextInt();
			System.out.println("Enter the denominator of your second fraction");
			int secondDenominator = userInput.nextInt();
			
			int totalDenominator = firstDenominator * secondDenominator;
			int firstNumeratorMult = firstNumerator * secondDenominator;
			int secondNumeratorMult = secondNumerator * firstDenominator;
			int totalNumerator = firstNumeratorMult / secondNumeratorMult;
			System.out.println("Your answer is: " + totalNumerator + "/" + totalDenominator);
		}
		if (response ==  5) {
			System.out.println("You've chosen to return to the menu.");	
			call.main(null);	
		}
		if (response ==  6) {
			System.out.println("Goodbye");
			System.exit(0);
		}
	
	}
}
