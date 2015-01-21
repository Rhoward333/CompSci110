import javax.naming.spi.DirStateFactory.Result;


public class Scratchpad2 {

		//scope [static] resturn type Name(parameter list)
	public int sandNum;
	public int boxNum;
	
	//Instance method that returns the remainder of sandNum
		//divided by boxNum
	public int finalTotal(int sandNum, int boxNum) {
		return ((sandNum % sandNum) / boxNum);
	}
	
	public static int sumOfSquares(int num1, int num2) {
	//Pseudocode- Listing the steps
		//Square the first number, store the result.
		//Square the second number, store the result.
		//Add the two results, store the result.
		//Return the final result.
		return (num1 * num1) + (num2 * num2) ;
	}
	
	public static void main(String[] args) {
		int result = Scratchpad2.sumOfSquares(3, 4); //Should return 25
		System.out.println(result);
		}
	
	
	}

