
public class Car {

	public String vin;
	public byte doors;
	public short productionNumber;
	public static short nextProductionNumber = 1;
	
	public static void main(String[] args) {}
		public Car() {
		Car a1 = new Car();
		a1.vin = "1V2398UH";
		a1.doors = 2;
		a1.productionNumber = nextProductionNumber;
		a1.nextProductionNumber += 1;
		System.out.println("First Car: " + a1.vin + a1.doors + a1.productionNumber);
		System.out.println("Next production number: " + nextProductionNumber);
		
		Car b2 = new Car();
		b2.vin = "G98W202U";
		b2.doors = 4;
		b2.productionNumber = nextProductionNumber;
		b2.nextProductionNumber += 1;		
		System.out.println("Second Car: " + b2.vin + b2.doors + b2.productionNumber + b2.nextProductionNumber);
		System.out.println("Next production number: " + nextProductionNumber);
		
		
}
}