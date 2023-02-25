package OOP.Java_50;

public class Main {
	public static void main(String[] args) {
		String s1 = "doanvinh";
		String s2 = "DOANVINH";
		String s3 = "doanvinh";
		
		
		// hàm equals => so sánh 2 chuỗi giống nhau, có phân biệt hoa thường
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println("-------------------");
		// euqal isIgoneCase
		System.out.println("equalsIgnoreCase");
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		
		// hàm compareTo => so sánh > < =
		System.out.println("-------CompareTO------");
		String sv1 = "Nguyen Van A";
		String sv2 = "Nguyen Van B";
		String sv3 = "Nguyen Van";
		String sv4 = "Nguyen Van A";
		
		System.out.println(sv1.compareTo(sv2));
		System.out.println(sv1.compareTo(sv3));
		System.out.println(sv1.compareTo(sv4));
		
		// hàm compareToIgnore tương tự là so sánh k phân biệt
		
		
		
		// regionMatches so snahs 1 đoạn 
		System.out.println("--------------");
		String r1 = "TITV.vn";
		String r2 = "TV.v";
		boolean check = r1.regionMatches(2, r2, 0, 4);
		System.out.println(check);
		
		// start with ktra xem bắt đầu 
		System.out.println("--------------");
		String sdt = "037456789";
		System.out.println(sdt.startsWith("037"));
		System.out.println(sdt.startsWith("034"));
		
		// end with kiem tra  chuoi ket thuc bang 
		System.out.println("--------------");
		String nameFile = "Image.PNG";
		String nameFile2 = "Java.PDF";
		
		if (nameFile.endsWith(".PNG")) {
			System.out.println("FILE is IMAGE");
		}  else if (nameFile.endsWith(".PDF")) {
			System.out.println("FILE is PDF");
		}
		
		if (nameFile2.endsWith(".PNG")) {
			System.out.println("FILE2 is IMAGE");
		}  else if (nameFile2.endsWith(".PDF")) {
			System.out.println("FILE2 is PDF");
		}
		
		
	}
}
