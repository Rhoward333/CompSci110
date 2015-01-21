import java.util.Scanner;

public class RunConsole {

	public static void main(String[] args) {
		ConsoleMenu cats = new ConsoleMenu();
		byte age;
		age = cats.promptForByte("Please enter your age", (byte)0, (byte)120);
		System.out.println(age);
	}

}
