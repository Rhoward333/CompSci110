import Enums.Color;


public class Driver {

	public PowerRanger rangerBuilder(Color color, String name, boolean stillAlive) {
		
		PowerRanger powerRanger = new PowerRanger();
		powerRanger.color = color;
		powerRanger.name = name;
		powerRanger.stillAlive = stillAlive;
		return powerRanger;
	}
	
	
	public void threeRangers() {
		PowerRanger yellowRanger = rangerBuilder(Color.YELLOW, "Trang", true);
		PowerRanger redRanger = rangerBuilder(Color.RED, "Troy", true);
		PowerRanger greenRanger = rangerBuilder(Color.GREEN, "Tommy", true);
	
		yellowRanger.itsMorphinTime();
		redRanger.itsMorphinTime();
		greenRanger.itsMorphinTime();		
	}
	
	
	public static void main(String[] args) {
		Driver runDriver = new Driver();
		runDriver.threeRangers();

	}

}
