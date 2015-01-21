import java.util.Random;

public class Die {
	
	//Every die has a set number of sides.
		//Keeps track of the last value rolled.
	private int dieSides;
	
	public int random() {
		Random randy = new Random();
		return randy.nextInt(DiceBag.getDieSides());
	}
	
	private int dice;
	
	public int getDice() {
		return dice;
	}
	
	public void setDice(int dice) {
		this.dice = dice;
	}
	
	public void rollStuff() {
		setDice(random()+1);
	}
	
	
	}
	

