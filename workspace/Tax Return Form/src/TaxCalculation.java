import java.util.Scanner;
public class TaxCalculation {

	public static void main(String[] args) {
		Scanner scanLee = new Scanner(System.in);
		System.out.println("Which tax form are you completing?");
		System.out.println("Single tax form:             1");
		System.out.println("Married Filing Jointly:      2");
		System.out.println("Married Filing Separately:   3");
		System.out.println("Head of the Household:       4");
		int formType = scanLee.nextInt();
		
		
		//----------Single----------
		if (formType == 1) {
			System.out.println("Your filing status is Single.");
			
			//----------Copy-Pasta Here---------//
			System.out.println("What was the numerical amount of your taxable income?");
			System.out.print("$");
			Float taxableIncome = scanLee.nextFloat();
				if (taxableIncome % 100 <= 49) {
					float taxedIncome = (float) (taxableIncome * .28);
					System.out.println("Tax Owed: " + "$" + taxedIncome);
				}
				else {
					float taxedIncome = (float) (taxableIncome * .201);
					System.out.println("Tax Owed: " + "$" + taxedIncome);
				}
			
		}
		
		
		//----------Married (Jointly)----------
		if (formType == 2) {
			System.out.println("Your filing status is Married, Filing Jointly.");
			
			System.out.println("What was the numerical amount of your taxable income?");
			System.out.print("$");
			Float taxableIncome = scanLee.nextFloat();
				if (taxableIncome >= 100000) {
					float taxedIncome = (float) (taxableIncome * .25);
					taxedIncome -= 8142.50;
					System.out.println("Tax Owed: " + "$" + taxedIncome);
				}
				else {
					float taxedIncome = (float) (taxableIncome * .16);
					System.out.println("Tax Owed: " + "$" + taxedIncome);
				}
		}
		
		
		//----------Married (Separately)----------
		if (formType == 3) {
			System.out.println("Your filing status is Married, Filing Seperately.");
			
			System.out.println("What was the numerical amount of your taxable income?");
			System.out.print("$");
			Float taxableIncome = scanLee.nextFloat();
				if (taxableIncome >= 100000) {
					float taxedIncome = (float) (taxableIncome * .28);
					taxedIncome -= 6267.25;
					System.out.println("Tax Owed: " + "$" + taxedIncome);
				}
				else {
					float taxedIncome = (float) (taxableIncome * .21);
					System.out.println("Tax Owed: " + "$" + taxedIncome);
				}
		}
		
		
		//----------Head of the Household----------
		if (formType == 4) {
			System.out.println("Your filing status is Head of the Household.");
			
			System.out.println("What was the numerical amount of your taxable income?");
			System.out.print("$");
			Float taxableIncome = scanLee.nextFloat();
				if (taxableIncome >= 100000) {
					float taxedIncome = (float) (taxableIncome * .25);
					taxedIncome -= 5497.50;
					System.out.println("Tax Owed: " + "$" + taxedIncome);
				}
				else {
					float taxedIncome = (float) (taxableIncome * .18);
					System.out.println("Tax Owed: " + "$" + taxedIncome);
				}
		}

		
		
	}

}
