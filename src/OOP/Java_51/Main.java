package OOP.Java_51;

public class Main {
	public static void main(String[] args) {
		String s1 = "xin chào cô chú, xin chào các bạn, xin chờ";
		String s2 = "xin chào";
		String s3 = "xin chào 123";
		char c1 = 'ô';
		
		// dương, = 0 là có, âm là ko
		
		// hàm indexOf 
		System.out.println(s1.indexOf(s2));
		System.out.println(s1.indexOf(s3));
		
		// sử dụng vị trí bắt đầu ìndexOf
		System.out.println(s1.indexOf(s2, 2));
		
		// tìm kiếm char
		System.out.println(s1.indexOf(c1));
		System.out.println(s1.indexOf(c1, 12));
		
		//lastIndexOf ngược lại phải qua trái 
		
	}
}
