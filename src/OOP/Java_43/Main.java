package OOP.Java_43;

public class Main {
	public static void main(String[] args) {
		MyMath m = new MyMath();
		System.out.println(m.findMin(1, 10));
		System.out.println(m.findMin(2.3, 1.9));
		
		double arr[] = new double[] {1,2,3,4,5,6};
		System.out.println(m.tinhTong(arr));
		
		
	}
	
}
