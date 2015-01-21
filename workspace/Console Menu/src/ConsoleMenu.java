import java.util.Scanner;

public class ConsoleMenu {
	public static Scanner scanLee = new Scanner(System.in);
	
	
	public byte promptForByte(String prompt, byte low, byte high) {
		boolean validInput = true;
		byte userByte = 0;
		
		do{
			System.out.println(prompt);
			userByte = scanLee.nextByte();
		
		if(userByte < low || userByte > high) {
			System.out.println("That input is not valid.");
		}
		else 
			validInput = false;
		}
		while(validInput); 
		return userByte;	
	}
		
		
	public short promptForShort(String prompt, short low, short high) {
		boolean validInput = true;
		short userShort = 0;
		
		do{
			System.out.println(prompt);
			userShort = scanLee.nextShort();

		if(userShort < low || userShort > high) {
			System.out.println("That input is not valid.");
		}
		else 
			validInput = false;
		}
		while(validInput); 
		return userShort;	
	}
	
	
	public long promptForlong(String prompt, long low, long high) {
		boolean validInput = true;
		long userLong = 0;
		
		do{
			System.out.println(prompt);
			userLong = scanLee.nextLong();
		if(userLong < low || userLong > high) {
				System.out.println("That input is not valid.");
			}
		else { 
				validInput = false;
			}
		}
		while(validInput);
		return userLong;
		}  
			
	
	public int promptForInt(String prompt, int low, int high) {
		boolean validInput = true;
		int userInt = 0;
		
		do{
			System.out.println(prompt);
			userInt = scanLee.nextInt();
		if(userInt < low || userInt > high) {
				System.out.println("That input is not valid.");
			}
		else { 
				validInput = false;
			}
		}
		while(validInput);
		return userInt;
		}
	

	public float promptForFloat(String prompt, float low, float high) {
		boolean validInput = true;
		float userFloat = 0f;
		
		do{
			System.out.println(prompt);
			userFloat = scanLee.nextFloat();
		if(userFloat < low || userFloat > high) {
				System.out.println("That input is not valid.");
			}
		else { 
				validInput = false;
			}
		}
		while(validInput);
		return userFloat;
		}
	
	
	public double promptForDouble(String prompt, double low, double high) {
		boolean validInput = true;
		double userDouble = 0d;
		
		do{
			System.out.println(prompt);
			userDouble = scanLee.nextDouble();
		if(userDouble < low || userDouble > high) {
				System.out.println("That input is not valid.");
			}
		else { 
				validInput = false;
			}
		}
		while(validInput);
		return userDouble;
		}



	public boolean promptForBoolean(String prompt){
		boolean userBoolean = scanLee.nextBoolean();
		return userBoolean;
		
	}
	
	public char promptForChar(String prompt) {
		String userNotAChar = scanLee.nextLine();
		char userChar = userNotAChar.charAt(0);
		return userChar;
	}
}


