import java.util.Random;
import java.util.Scanner;
public class Sandbox {

	
	public int[] nums;
	public Student[] students;
	
//	public void run() {
	
//		nums = new int[105];
//		System.out.println("Array Length: " + nums.length);
//		
//		nums[0] = 64;
//		nums[2] = 10;
//		nums[4] = 24;
//		//nums[nums.length -1] = 24;
//		for (int i = 0; i < nums.length; i++) {
//		System.out.println(nums[i]);
//		}
//	}
	public void run() {
		
		
		
		Scanner scanLee = new Scanner(System.in);
		System.out.println("How many students do you want?");
		String numOfStudentsString = scanLee.nextLine();
		int numOfStudents = Integer.parseInt(numOfStudentsString);
		students = new Student[numOfStudents];
		for (int y = 0; y < students.length; y++) {
			students[y] = promptForStudent();
		}
		
		for (int z = 0; z < students.length; z++) {
			System.out.println("Student" + z+1 + " is " + students[z].age + " years old and has " + students[z].hairColor + " hair.");
			}
	}
		//Build-a-Student
		public Student promptForStudent(){
			Student student = new Student();
			Scanner scanLee = new Scanner(System.in);
			
			System.out.println("What is the student's age: ");
			String ageInput = scanLee.nextLine();
			student.age = Byte.parseByte(ageInput);
			
			System.out.println("What is the student's hair color: ");
			String hairInput = scanLee.nextLine();
			student.hairColor = hairInput;
	
			return student;
		}
		
	
	
	public static void main(String[] args) {
		//new Sandbox().run();
		
		Random rand = new Random();
		int datArray[] = new int[10];	
		for (int z = 0; z < datArray.length; z++) {
			datArray[z] = rand.nextInt();
			if(datArray[z] % 2 == 0) {
				System.out.println(datArray[z]);
			}
		}
		
	}
}