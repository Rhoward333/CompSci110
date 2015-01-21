import java.util.Random;

public class Dice {
	
	public int random() {
		Random randy = new Random();
		return randy.nextInt(6);
	}
	
	private int dice;
	
	public int getDice() {
		return dice;
	}
	
	public void setDice(int dice) {
		this.dice = dice;
	}
	
	public void rollStuff(){
		setDice(random()+1);
	}
}
