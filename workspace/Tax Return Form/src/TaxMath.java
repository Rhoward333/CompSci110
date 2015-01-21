import java.util.Scanner;

public class TaxMath {

	public static void main(String[] args) {
		// 84k-87,850 = 4881.25 + (25% of the amount over 36,250)
		// 87,860-183,250 = 17,891.25 + (28% of the amount over 87850)
		Scanner scanLee = new Scanner(System.in);

		System.out.println("Which tax form are you completing?");
		System.out.println("Single tax form:             1");
		System.out.println("Married Filing Jointly:      2");
		System.out.println("Married Filing Separately:   3");
		System.out.println("Head of the Household:       4");
		int formType = scanLee.nextInt();

		System.out.println("How much did you make this year?");
		System.out.print("$");
		float userIncome = scanLee.nextFloat();

		// Don't touch
		float remainder = userIncome % 100;

		// Single Tax Form
		if (formType == 1) {

			// Smaller range
			if (userIncome >= 36250 && userIncome <= 87850) {
				userIncome -= remainder;
				userIncome += ((remainder >= 49) ? 25: 75);
				System.out.println(4991.25 + (.25 * (userIncome - 36250)));
			}

			// Larger range
			if (userIncome > 87850 && userIncome <= 183250) {
				if (remainder <= 49) {
					remainder = 25;
					userIncome -= base;
					userIncome += remainder;
				} else {
					remainder = 75;
					userIncome -= base;
					userIncome += remainder;
				}
				System.out.println(17891.00 + (.28 * (userIncome - 87850)));
			}
		}

		// Married Filing Jointly
		if (formType == 2) {

			// Smaller range
			if (userIncome >= 72500 && userIncome <= 146400) {
				if (remainder <= 49) {
					remainder = 25;
					userIncome -= base;
					userIncome += remainder;
				} else {
					remainder = 75;
					userIncome -= base;
					userIncome += remainder;
				}
				System.out.println(9976.25 + (.25 * (userIncome - 72500)));
			}
		}

		// Married Filing Separately
		if (formType == 3) {

			// Smaller range
			if (userIncome >= 36250 && userIncome <= 73200) {
				if (remainder <= 49) {
					remainder = 25;
					userIncome -= base;
					userIncome += remainder;
				} else {
					remainder = 75;
					userIncome -= base;
					userIncome += remainder;
				}
				System.out.println(4991.25 + (.25 * (userIncome - 36250)));
			}

			// Larger range
			if (userIncome > 73200 && userIncome <= 111525) {
				if (remainder <= 49) {
					remainder = 25;
					userIncome -= base;
					userIncome += remainder;
				} else {
					remainder = 75;
					userIncome -= base;
					userIncome += remainder;
					System.out.println(userIncome);
				}
				System.out.println(14221.75 + (.28 * (userIncome - 73200)));
			}
		}

		// Head of The Household
		if (formType == 4) {

			// Smaller range
			if (userIncome >= 48600 && userIncome <= 125450) {
				if (remainder <= 49) {
					remainder = 25;
					userIncome -= base;
					userIncome += remainder;
				} else {
					remainder = 75;
					userIncome -= base;
					userIncome += remainder;
				}
				System.out.println(6646.25 + (.25 * (userIncome - 48600)));
			}

		}

	}
}
