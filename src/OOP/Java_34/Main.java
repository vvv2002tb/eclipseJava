package OOP.Java_34;

public class Main {
	public static void main(String[] args) {
		MyDate md4 = new MyDate(13, 04, 2002);
		MyDate md5 = new MyDate(13, 04, 2002);
		MyDate md6 = new MyDate(13, 04, 2002);
		MyDate md7 = new MyDate(20, 12, 2002);
		System.out.println(md4);
		System.out.println(md5);
		
//		không thể sd kiểu so sánh này chỉ có thể so sánh kiểu nguyên thủy 
//		=> dùng equals
//		if (md4==md5) {
//			System.out.println("cung ngay");
//		} else {
//			System.out.println("khac ngay");
//		}
		
		System.out.println("So sanh md4 va md5: " + md4.equals(md5));
		System.out.println("So sanh md6 va md7: " + md6.equals(md7));
		
		// tương tự như equals thì hascode sẽ trả về 1 giá trị đại diện cho đối tượng 
		// nếu đtg giống nhau thì sẽ trả về 1 gtri giống nhau 
		System.out.println(md4.hashCode());
		System.out.println(md5.hashCode());
	}
}
