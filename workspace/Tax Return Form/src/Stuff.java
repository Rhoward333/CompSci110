import java.util.Scanner;
public class Stuff {

	public static void main(String[] args) {
		Scanner scanLee = new Scanner(System.in);
		int cats = scanLee.nextInt();
		int total = cats % 100;
		//-Stuff---
		System.out.println("Pre: " + total);
		if (total <= 49) {
			total = 25;	
			System.out.println("Low: " + total);
		}
		else { 
			total = 75;
			System.out.println("High: " + total);
		}
		
	}
}
