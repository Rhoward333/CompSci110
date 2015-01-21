import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) {
		while (true) {
		Scanner scanLee = new Scanner(System.in);
		System.out.println("Enter a number foo!");
		int num = scanLee.nextInt();
		
		if (num % 2 ==0) {
			System.out.println("It's even!");
		}
		
		else {
			System.out.println("It's odd!");
		if (num > 1000) {
			System.out.println("It's over 1000!");
		}
		else if (num > 100) {
			System.out.println("It's over 100!");
		}
		else {
			System.out.println("It's not over 100!");
		}
	}		
}
}
}
