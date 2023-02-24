package OOP.Java_46;

public class Main {
	public static void main(String[] args) {
		System.out.println("cau1: ");
		CalculatorFX570 mfx570 = new CalculatorFX570();
//		CalculatorFX500 mfx500 = new CalculatorFX500();
		
		System.out.println(mfx570.sum(5, 3));
		System.out.println(mfx570.sub(5, 3));
		System.out.println(mfx570.multi(5, 3));
		System.out.println(mfx570.divide(6, 3));
		
		// tuong tu tao new ApplicationCaculator
		ApplicationCaculator app1 = new ApplicationCaculator();
		System.out.println(app1.sum(1, 2));
	}
}
