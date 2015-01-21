import java.util.Scanner;

public class FirstExercise {

	public static void main(String[] args) {
		//Prompt the user for an integer and analyze the input.
			//Decide whether the input is positive or negative.
			//Decide whether the input is odd or even.
			//Decide whether or not it is divisible by 7.
			//Note that 0 is neither odd nor even, nor positive or negative.
		
		System.out.print("Please enter a number: ");
		Scanner num1Scanner = new Scanner(System.in);
		int num1 = num1Scanner.nextInt ();
		System.out.println("Your number was " + num1);
		//User inputs number and receives feedback.
		
		if (num1 > 0) {
			System.out.println(num1 + " is a positive number.");}
		if (num1 < 0) {
			System.out.println(num1 + " is a negative number.");}
		if (num1 == 0) {
			System.out.println(num1 + " is neither a positive, nor a negative number.");}
		//User finds out if their number was negative, positive, or neither.
		
		int jim = (num1 % 2);
		if (jim == 0 && num1 != 0) {
			System.out.println(num1 + " is an even number.");}
		if (jim > 0 || jim < 0) {
			System.out.println(num1 + " is an odd number.");}
		if (num1 == 0) {
			System.out.println(num1 + " is neither even nor odd.");}
		//User finds out if their number was even, odd, or neither.
		
		int StinkyTheWonderHampster = (num1 % 7);
		if (StinkyTheWonderHampster == 0 && num1 != 0) {
			System.out.println("Fun Fact: " + num1 + " is divisible by 7.");}
		if (StinkyTheWonderHampster < 0 || StinkyTheWonderHampster > 0) {
				System.out.println("Fun Fact: " + num1 + " is not divisible by 7.");}
		if (num1 == 0) {
			System.out.println(num1 + " is not divisible by 7.");}
		
	
		}
	}

