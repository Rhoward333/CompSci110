import java.util.Scanner;

public class BirthdayBrains {

	public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
	boolean running = true;
	while (running){
		
	int currentYear = 0;
	int currentMonth = 0;
	int currentDay;
	int yearBorn = 0;
	
	//Current 
	boolean looping = true;
	while (looping){
	System.out.println("What year is it? ");
	currentYear = userInput.nextInt();
	if (currentYear < 2014) {
		System.out.println("That year isn't valid.");
	}
	else looping = false;
	}
	
	looping = true;
	while (looping){
	System.out.println("What month is it? ");
	currentMonth = userInput.nextInt();
	switch (currentMonth){
	case 1 :
		looping = false;
		break;
	case 2 :
		looping = false;
		break;
	case 3 :
		looping = false;
		break;		
	case 4 :
		looping = false;
		break;
	case 5 :
		looping = false;
		break;
	case 6 :
		looping = false;
		break;
	case 7 :
		looping = false;
		break;		
	case 8 :
		looping = false;
		break;
	case 9 :
		looping = false;
		break;
	case 10 :
		looping = false;
		break;
	case 11 :
		looping = false;
		break;		
	case 12 :
		looping = false;
		break;
	default: 
		System.out.println("That month isn't valid.");
		continue;
			}
	
	looping = true;
	while (looping){
	System.out.println("What day is it? ");
	currentDay = userInput.nextInt();

	if ((currentMonth == 1 && currentDay < 30 && currentDay > 0)){
		looping = false;
		}
	if ((currentMonth == 3 && currentDay < 32 && currentDay > 0)){
		looping = false;
		}
	if ((currentMonth == 5 && currentDay < 32 && currentDay > 0)){
		looping = false;
		}
	if ((currentMonth == 7 && currentDay < 32 && currentDay > 0)){
		looping = false;
		}
	if ((currentMonth == 8 && currentDay < 32 && currentDay > 0)){
		looping = false;
		}
	if ((currentMonth == 9 && currentDay < 32 && currentDay > 0)){
		looping = false;
		}
	if ((currentMonth == 12 && currentDay < 32 && currentDay > 0)){
		looping = false;
		}
	}
	
	looping = true;
	while (looping){
		System.out.println("What year were you born? ");
		yearBorn = userInput.nextInt();
		if (yearBorn > 2014) {
			System.out.println("That year isn't valid.");
		}
		else looping = false;
		}
	System.out.println("What month were you born? ");
	int monthBorn = userInput.nextInt();
	System.out.println("What day were you born? ");
	int dayBorn = userInput.nextInt();
	
	int totalAge = currentYear - yearBorn;
	System.out.println("You are " + totalAge + " years old!" );
	
	if (totalAge == 18) {
		System.out.println("You are my age!");
	}
	if (totalAge > 18) {
		System.out.println("You are older than me!");
	}
	if (totalAge < 18) {
		System.out.println("You are younger than me!");
	}
	
	System.out.println("Would you like to enter more data?");
	System.out.println("Enter More Data: 1");
	System.out.println("Quit Application: 2");
	int option = userInput.nextInt();
	
	switch (option){
	case 2 : 
		System.out.println("Goodbye.");
		running = false;
		break;
	default : 
		System.out.println("Moar data.");
	}
	
	
		}
	}
}
}



