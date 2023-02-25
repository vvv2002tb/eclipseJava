package OOP.Java_56;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String s = "Xin chao cac ban, toi la Mrv889";
		String[] a = s.split(",");
		String[] b = s.split(" ");
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		String s2 = "Xin chao, minh la Vinh. Minh la IT";
		String[] c = s2.split("\\.|\\,");
		System.out.println(Arrays.toString(c));
		
		// get ten
		String s3 = "Doan Trong Vinh";
		String[] d = s3.split(" ");
		System.out.println(Arrays.toString(d));
		int index = d.length - 1;
		System.err.println(d[index]);
	}
}
