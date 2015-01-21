
public class Methemagical {

	//What is static?
		//It means "in one place".
		//All static members (variables and methods) are single to the class.
		//Static members can be seen by instances or by the class itself.
	
	//When should we use static over instance?
		//Whenever we access or mutate static data.
		//Whenever there is a function that doesn't need to access or 
			//mutate instance data.
		
	public static int addDemNumbahz(int x, int y) {
		int result = x + y;
		return result;
	}
	
	public static int subDemNumbahz(int x, int y) {
		int result = x - y;
		return result;
	}
	
	public static int multiDemNumbahz(int x, int y) {
		int result = x * y;
		return result;
	}
}
