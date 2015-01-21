import java.util.Scanner;

public class ResidentialForm {

	public static void main(String[] args) {
		boolean resident = false;
		Scanner scanLee = new Scanner(System.in);
		System.out.println("Please answer all questions with a Y (Yes) or N (No), or with a numerical value. \n");

		// First Question//2013 Presence
		System.out.println("How many days was your dependent physically present in the United States during 2013?");
		int twentyThirteen = scanLee.nextInt();

		if (twentyThirteen <= 31) {
			resident = false;
		}
		else if (twentyThirteen >= 183) {
			resident = true;
		} else {

			// Second Question//Foreign Tax Form
			System.out.println("For 2013, did your dependent have a tax home in a foreign country and a closer connection to that country than to the United States?\n");
			System.out.println("Yes: 1");
			System.out.println("No:  2");
			int otherCountry = scanLee.nextInt();

			if (otherCountry == 1) {
				resident = false;
			}

			else {
				// Third Question//2012 Presence
				System.out.println("How many days was your dependent physically present in the United States during 2012?");
				int twentyTwelve = scanLee.nextInt();
				twentyTwelve /= 3;
				int totalPresence = twentyThirteen + twentyTwelve;

				if (totalPresence >= 183) {
					resident = true;
				} else {

					// Fourth Question//2011 Presence
					System.out.println("How many days was your dependent physically present in the United States during 2011?");
					int twentyEleven = scanLee.nextInt();
					twentyEleven /= 6;
					totalPresence += twentyEleven;
				}
				if (totalPresence >= 183) {
					resident = true;
				} else {
					resident = false;
				}
			}
		}
		if (resident == true) {
			System.out.println("Your dependent is a resident alien for U.S. tax purposes.");
		} else {
			System.out.println("Your dependent is a non-resident alien for U.S. tax purposes.");
		}
	}

}
