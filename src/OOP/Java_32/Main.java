package OOP.Java_32;

public class Main {
	public static void main(String[] args) {
		MyDate md = new MyDate(-1, -12, -1212);
		MyDate md1 = new MyDate(2, 12, 2212);
		System.out.println("Date: " + md.getDay() + " - " + md.getMonth() + " - " + md.getYear());
		System.out.println("Date: " + md1.getDay() + " - " + md1.getMonth() + " - " + md1.getYear());
		
		
	}
}
