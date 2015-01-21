import java.util.Scanner;

public class SecondExercise {

	public static void main(String[] args) {
		// Prompt the user for a year and analyze that year.
			//Decide whether it was a leap year.
			//Divisible by 4 or 100, but not both unless it's divisible by 400.
			//Must be after the year 1582
			
		System.out.print("Please enter a year: ");
		Scanner yearScanner = new Scanner(System.in);
		int year = yearScanner.nextInt ();
		//User inputs a year.
		
		int FourYear = (year % 4);
		int HundredYear = (year % 100);
		int FourHundredYear = (year % 400);
		//Year is divided by 3 sets of numbers.
		
		if (FourYear == 0 && HundredYear != 0 && FourHundredYear != 0 && year >= 1582) {
			System.out.println("The year " + year + " is a leap year!");}
		else if (HundredYear == 0 && FourYear != 0 && FourHundredYear != 0 && year >= 1582) {
			System.out.println("The year " + year + " is a leap year!");}
		else if (FourHundredYear == 0 && year >= 1582) {
			System.out.println("The year " + year + " is a leap year!");}
		else if (year < 1582){ 
			System.out.println("The leap year wasn't invented until 1582.");}
		else if (FourYear != 0 && HundredYear != 0 && FourHundredYear != 0 && year >= 1582) {
		System.out.println("The year " + year + " is not a leap year.");}
		else {
			System.out.println("The year " + year + " is not a leap year.");}
		
		}
	}


