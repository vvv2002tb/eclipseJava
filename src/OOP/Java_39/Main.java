package OOP.Java_39;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("Vinh doan", 2002);
		person1.eat();
		person1.sleep();
		Student std1 = new Student("Mrv889", 2002, 202105726, "K65E2");
		System.out.println("Studen1: ");
		std1.eat();
		std1.sleep();
		std1.playGame();
		std1.learn();
	}
}
