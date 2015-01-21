
public class DiceBag {
	//Can produce any kind of die required by the GM.
		//As well as any number of die.
	//Also keeps track of any modifiers. (+2/-5/etc.)
	private static int numOfSides;
	private static int numOfDie;
	
	private int dieRoll;
	
	public static int getDieNum() {
		return numOfSides;
	}
	public void setDieNum(int numOfDie) {
		this.numOfDie = numOfDie;
	}
	public static int getDieSides() {
		return numOfSides;
	}
	public void setDieSides(int numOfSides) {
		this.numOfSides = numOfSides;
	}
	
	
	private Die[] dice;
	public DiceBag(int numOfDice, int faceValue)
	{
		dice = new Die[numOfDice];
		for(int i = 0; i<dice.length; i++)
		{
			dice[i] = new Die();
		}
	}
	
	int[] diceBag = new int[getDieNum()];

	public int[] getDiceBag() {
		return diceBag;
	}

	public void setDiceBag(int[] diceBag) {
		this.diceBag = diceBag;
	}
	
		
	}
	