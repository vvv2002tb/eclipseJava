package OOP.Java_52;

public class Main {
	public static void main(String[] args) {
		String s1 = "dOaNvInH";
		String s2 = ".vn";
		
		// hàm concat: nối chuỗi
		System.out.println(s1.concat(s2));
		
		
		// hàm replace 
		String s3 = "Doanvinh.vn";
		System.out.println(s3.replaceAll("Doanvinh", "mrv"));
		
		
		// toLowcase => chuyển về viết thường
		// toUpcase =>  chuyển về viết hoa
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		
		// trim() xoa khoang trang
		String s4 = " xin chao moi nguoi     ";
		System.out.println(s4);
		System.out.println(s4.trim());
		
		//sub string cat chuoi
		String s5 = "xin chao moi nguoi";
		System.out.println(s5.substring(0, 8));
	}
}
