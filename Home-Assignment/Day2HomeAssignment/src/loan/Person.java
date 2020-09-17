package loan;

public class Person {

	
	private String name;
	private int age;
	private String interest;
	public Person(String name, int age,String interest) {
		
		this.name = name;
		this.age = age;
		this.interest=interest;
	}
	public String getInterest() {
		return interest;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
	
	
}
