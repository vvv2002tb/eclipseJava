import java.util.Scanner;

public class Java_16 {
	// math và hàm toán học 
	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
		System.out.printf("input a: ");
		a = sc.nextDouble();
		System.out.printf("input b: ");
		b = sc.nextDouble();
		
		
		// hàm abs giá trị tuyệt đối 
		System.out.println("|a| = " + Math.abs(a));
		
		// ham tim min 
		System.out.println("min(a, b) = " + Math.min(a, b));
		
		// ham tim max 
		System.out.println("max(a, b) = " + Math.max(a, b));
		
		// hàm ceil  loai bo sau dau phay 
		System.out.println("ceil(a) = " + Math.ceil(a));
		
		// hàm floor lam tron phan thap phan 
		System.out.println("floor(a) = " + Math.floor(a));
		
		// can bac hai 
		System.out.println("sqrt(a) = " + Math.sqrt(a));
		
		// mũ 
		System.out.println("pow(a) = " + Math.pow(a, b));
		
		
		// chu vi ( PI có sắn trong Math) 
		System.out.printf("input r: ");
		double r = sc.nextDouble();
		double chuVi = 2*Math.PI*r;
		System.out.println("Chu vi = " + Math.floor(chuVi));
		// dien tich 
		double dienTich = Math.pow(r, 2);
		System.out.println("Dien tich = " + dienTich);
	}
}
