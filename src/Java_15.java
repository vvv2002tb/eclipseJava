import java.util.Scanner;

public class Java_15 {
	// toán từ điều khiện trong java
	// (boolean-expression) if-true-return-this: if-false-return-this
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("nhap a: ");
		int a = sc.nextInt();
		
		String result = (a%2==0)?"So chan":"So le";
		System.out.println(a + " la " + result);
	}
}
