import java.util.Scanner;

public class Cats {

	public static void main(String[] args) {
		boolean go = false;
		System.out.print("Enter a number: ");
		Scanner responseCheck = new Scanner(System.in);
		int response = responseCheck.nextInt();
		
//		while (go) {
//			//Do loop stuff.
//		}
//		
//		do{ 
//			//Do loop stuff.
//		}while (go);
		
		for  (int cat = response; cat >= 0; cat--) {
			System.out.println(cat);
		}
		//LOOPS AND WHAT THEY DO
		//While Loops: May run ZERO or more times. It may be skipped over if necessary. May run any number of times.
		//Do While Loops: Will run at least ONCE. Can't be skipped. 
		//For Loop: Runs for a pre-determined amount of times. Has a target amount of times to run.
	}
}


