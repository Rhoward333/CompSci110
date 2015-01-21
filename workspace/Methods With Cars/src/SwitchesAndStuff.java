
public class SwitchesAndStuff {
	public static void main (String [] args){
		String s = "ID";
		
		String stateName = null;
		s = s.toUpperCase();
		switch (s){
		case "UT" : 
			stateName = "Utah";
			System.out.println("Utah");
			break;
			
		case "ID" : 
			stateName = "Idaho";
			System.out.println("Idaho");
			break;
			
		case "AZ" : 
			stateName = "Arizona";
			System.out.println("Arizona");
			break;
			
		default: 
			stateName = "Nope";
		System.out.println(stateName);	
		}
	}
}
