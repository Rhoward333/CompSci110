
public class Sandbox2 {


	
	public int tonsOfSand; 
	
	public void run() {
		Student s = new Student();
		System.out.println("Student name: " + s.getName());
		
		s.setName(null);
		System.out.println("Student name: " + s.getName());
	}
	
	
	public static void main(String[] args) {
		new Sandbox2().run();

	}

}
