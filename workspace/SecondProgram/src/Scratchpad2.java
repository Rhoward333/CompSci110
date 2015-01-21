import java.util.Scanner;

public class Scratchpad2 {

	
	public static void main(String[] args) {
		//Prompt user to enter two integers.
		//Report whether the first number is less than the sceond.
		//Print the equation and solution to the 5 major math operations.
			//using those two numbers.
		
		System.out.print("Please enter your first number: ");
		Scanner scanLee = new Scanner(System.in);
		int firstNumber = scanLee.nextInt();
		System.out.println("Your first number is " + firstNumber);
		//First number complete.
		
		System.out.print("Please enter your second number: ");
		Scanner scanLeereturns = new Scanner(System.in);
		int secondNumber = scanLeereturns.nextInt();
		System.out.println("Your second number is " + secondNumber);
		//Second number complete.
		
		int addition = firstNumber + secondNumber;
		int subtraction = firstNumber - secondNumber;
		int multiplication = firstNumber * secondNumber;
		int division = firstNumber / secondNumber;
		int modulation = firstNumber % secondNumber;
		//Math complete.
		
		System.out.println(firstNumber + "+" + secondNumber + "=" + addition);
		System.out.println(firstNumber + "-" + secondNumber + "=" + subtraction);
		System.out.println(firstNumber + "*" + secondNumber + "=" + multiplication);
		System.out.println(firstNumber + "/" + secondNumber + "=" + division);
		System.out.println(firstNumber + "%" + secondNumber + "=" + modulation);
		//Readout to the user complete.
		
	}
	
}
