import java.util.Scanner;

public class Fraction {
	
	public void ReduceStuff() {
		Scanner reduceInput = new Scanner(System.in);
		System.out.print("Enter your numerator: ");
		int numerator = reduceInput.nextInt();
		
		System.out.print("Enter your denominator: ");
		int denominator = reduceInput.nextInt();
		int totalBot = 0;
		
		if(denominator != 0)
		{
			int reducedDen = 0;
			int reducedNum = 0;
			
		for (int x = denominator; x >= 2; x--){
			int checkMulti = denominator % x;
		
		if(numerator > denominator) {
			reducedDen = denominator / x;
			}			
			
			int remainderImproper = numerator % denominator;
			int wholeNumImproper = numerator / denominator;
			int totalTopImproper = wholeNumImproper;
			totalBot = denominator / numerator;
			
		//Proper fractions.
		if(denominator > numerator) {
			reducedNum = numerator / x;
			}
		
			int remainderProper = numerator % denominator;
			int wholeNumProper = denominator / numerator;
			int totalTopProper = wholeNumProper;
			totalBot = denominator / numerator;
			}
			System.out.println(totalBot + "/" + reducedDen);
		}	
	}
}

