package OOP.Java_42;

public class Main {
	public static void main(String[] args) {	
		Dog d = new Dog();
		System.out.println(d.name + ": ");
		d.eat();
		d.makeSound();
		System.out.println("------------------------");
		Cat c = new Cat();
		System.out.println(c.name + ": ");
		c.eat();
		c.makeSound();
	}
}
