package OOP.Java_54;

public class Main {
	public static void main(String[] args) {
		Student sv1 = new Student(100, "Doan Vinh", "k65E2", 8.0);
		Student sv2 = new Student(150, "Thu trang", "k65E2", 7.0);
		Student sv3 = new Student(100, "Den miu", "k65E2", 8.0);
		
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		System.out.println(sv1.compareTo(sv2));
		System.out.println(sv1.compareTo(sv3));
		System.out.println(sv2.compareTo(sv3));
		
		
	}
}
