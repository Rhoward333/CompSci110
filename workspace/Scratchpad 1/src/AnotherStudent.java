
public class AnotherStudent {
	private short age;
	private String name;
	private Gender gender;
	
	public short getAge() {
		return age;
	}
	public void setAge(short age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;	
}
	
	public AnotherStudent(String name, short age, Gender gender) { 
		setName(name);
		setAge(age);
		setGender(gender);

	}
}
