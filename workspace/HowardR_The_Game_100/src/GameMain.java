import java.util.Scanner;

public class GameMain {

	public static void run() {
	Scanner scanLee = new Scanner(System.in);
	
	System.out.println("Play the Game: 1");
	System.out.println("How to Play: 2");
	System.out.println("Exit Application: 3");
	byte menuInput = scanLee.nextByte();
	
	if (menuInput == 1) {
		new GameStart();
	}
	if (menuInput == 2) {
		System.out.println("You and your opponent race for victory by seeing who can reach"
				+ " 100 points first. You both get a turn to roll a virtual pair of dice.\n"
				+ "The result of the dice is added to your score for the turn. You can choose"
				+ " to keep what you've earned that turn, or to roll again, going for even more"
				+ " points.\nIf you roll a 1 at any point during your turn, your points for that"
				+ " turn dissappear forever, and your turn ends immediately.\nIf you roll Snake-Eyes"
				+ ", which is both die resulting in a roll of 1, you lose all of the points in your"
				+ " bank.\n\n ");
		GameMain.run();
	}
	
	if (menuInput == 3) {
		System.out.println("Goodbye");
		System.exit(0);
	}
	
}
	
	public static void main(String[] args) {
		GameMain.run();

	}

}
