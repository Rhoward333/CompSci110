
public class Time {

	public static void main(String[] args) {
		//Programming Project 2.6
		int hour = 1;
		int minutes = 23;
		int seconds = 45;
		
		int convertedTime = (hour * 60) + minutes;
		int finalTime = (convertedTime *60) + seconds;
		if (hour == 1) {
		System.out.println(hour + " Hour " + minutes + " Minutes and " + seconds + " Seconds is a total of: " + finalTime + " seconds.");
		}
		else 
		System.out.println(hour + " Hours " + minutes + " Minutes and " + seconds + " Seconds is a total of: " + finalTime + " seconds.");	
	}

}
