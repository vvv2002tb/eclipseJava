package OOP.Java_55;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		Student sv1 = new Student(100, "Doan Vinh", "k65E2", 8.0);
		Student sv2 = new Student(150, "Thu trang", "k65E2", 7.0);
		Student sv3 = new Student(80, "Den miu", "k65E2", 8.0);
		
		Student[] arrStd = new Student[] {sv1, sv2, sv3};
		
		System.out.println(Arrays.toString(arrStd));
		// hàm sắp xếp
		Arrays.sort(arrStd);
		System.out.println(Arrays.toString(arrStd));
		
		// tìm kiếm
		System.out.println("bạn sv1 ở vị trí thu " + Arrays.binarySearch(arrStd, sv1));
		
	}
}
