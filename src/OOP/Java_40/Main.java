package OOP.Java_40;

public class Main {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		System.out.println(d.getName());
		
		BabyDog bbd = new BabyDog();
		bbd.eat();
		bbd.bark();
		bbd.cry();
		System.out.println(bbd.getName());
		
		Cat cat1 = new Cat("Miu");
		cat1.eat();
		cat1.meo();
		System.out.println(cat1.getName());
	}
}
