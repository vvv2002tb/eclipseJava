package OOP.Java_39;

public class Person {
	private String name;
	private int birthDay;
	
	
	public Person(String name, int birthDay) {
		this.name = name;
		this.birthDay = birthDay;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getBirthDay() {
		return birthDay;
	}


	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
	
	public void eat() {
		System.out.println("Eating.....");
	}
	public void sleep() {
		System.out.println("Sleeping....");
	}
	
	
}
