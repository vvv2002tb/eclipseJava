package OOP.Java_55;

import java.util.Arrays;

public class Main {
	public static int[] reverse(int[] x) {
		int[] rs = new int[x.length];
		int index = 0;
		for (int i=x.length-1; i>=0; i--) {
			rs[index] = x[i];
			index++;
		}
		return rs;
	}
	
	
	public static void main(String[] args) {
		int[] arr = new int[] {7,8,9, 1,2,3};
		int[] arr1 = new int[arr.length];
		System.out.println(Arrays.toString(arr));
		//hàm sắp xếp tang dan
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		// hàm tìm kiếm 
		// binarySearch trả về index nếu index âm => ko có phải sắp xếp trc nếu k trả về số âm
		System.out.println(Arrays.binarySearch(arr, 3));
		System.out.println(Arrays.binarySearch(arr, -1));
		
		// hàm điền giá trị 
		
		Arrays.fill(arr1,  (int) (Math.random()*10));
		System.out.println(Arrays.toString(arr1));
		
		// hàm giảm dần
		Arrays.sort(arr);
		arr = Main.reverse(arr);
		System.out.println(Arrays.toString(arr));
	}
}
