import java.util.Scanner;

public class FourthExercise {
	//Prompt the user for his/her age for this year.
			//Determine what year the user was born.
	public static void main(String[] args) {
		Scanner scanLee = new Scanner(System.in);
		System.out.print("How old will you be by the end of this year? ");
		int userAge = scanLee.nextInt();
		int currentYear = 2014;
		int valueTotal = currentYear - userAge;
		
		System.out.println("You were born in " + valueTotal);
		
		if (valueTotal == 1996) {
			System.out.println("You were born in the same year as me!");}		
		
}
}