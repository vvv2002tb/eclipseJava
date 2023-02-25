package OOP.Java_49;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.print("nhap vao chuỗi: ");
		s = sc.nextLine();
		System.out.println("----------");
		System.out.println("độ dài chuỗi: " + s.length());
		
		
		// hàm charAt(index) => lấy ra 1 kí tự tại vị trí\
		for(int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		//getChars() lay hang loat ki tu (vi tri bat dau, ket thuc, mang luu, vi tri muon them vao mang
		char[] arrChar = new char[10];
		s.getChars(1, 3, arrChar, 0);
		
		for(int i = 0; i < arrChar.length; i++) {
			System.out.print(arrChar[i]);
		}
 		// vị trí kết thúc -1 nên k lấy gtri tại vị trí kết thúc
		
		
		
		// get byte trả về 1 đại điện
		System.out.println(s.getBytes()); 
	}
}
