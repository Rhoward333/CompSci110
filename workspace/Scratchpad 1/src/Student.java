

public class Student {
	public byte age;
	public String hairColor;
	
	//Encapsulation
		//First, make the field private
	private String name;
	
		//Second, make accessors and mutators ("getters and setters")
			//You build a method for each get and set
		//Here is the "get" name method
	public String getName() {
		if (name == null || name == "") {
		name = "NO NAME";
		return name;
		}
		else return name;
	}
	
		//Here is the "set" name method
	public String setName(String newName) {
		name = newName;
		return name;
	}
}