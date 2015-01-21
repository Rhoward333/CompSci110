import java.util.Scanner;
//Class declaration
	//Defining a class is defining a custom data type.
//Every class has members.
	//Variables are data members.
//Methods are also members of a class.
	//They are sometimes referred to as functions.



public class MoarMethods {

	public int programID;
	Scanner scanLee = new Scanner(System.in);
	
	public int promptForInt(String promptForInt) {
		System.out.println(promptForInt);
		System.out.print("Your Number: ");
		int userNum = scanLee.nextInt();
		
		return userNum;
	}
	
	public void favoriteHoliday() {
		System.out.println("Fun Fact: My favorite holiday is Christmas.");
		System.out.println("Not that you cared anyways...");
	}
	
	public void multiplyNumbers() {
		int num1 = promptForInt("Yo dawg, give me a number: ");
		int num2 = promptForInt ("Yo dawg, give me another number: ");
		int num3 = promptForInt ("Yo dwag, MOAR NUMBERS: ");
		System.out.println("\nAnswer: " + (num1 + num2 + num3));
	}
	
	public void numberRange() {
		boolean running = true;
		while (running) {
			int r1 = 5;
			int r2 = 26;
			System.out.println("Enter a number between " + r1 + " and " + r2 + ".");
			System.out.print("Your Number: ");
			int response = scanLee.nextInt();
		if (response <= 26 && response >= 5) {
			running = false;
		}
		}
	}
	
	
		public void run() {
			multiplyNumbers();
			favoriteHoliday();
			//MoarMethods khanSolo = new MoarMethods();
			
		}
		
	public static void main(String[] args) {
		//run is an instance method
		//You need an instance of the class to use the method.
		//A method with the same name as its' class is called the constructor. 
		MoarMethods khanSolo = new MoarMethods();
		khanSolo.numberRange();
		khanSolo.run();
	}
}
