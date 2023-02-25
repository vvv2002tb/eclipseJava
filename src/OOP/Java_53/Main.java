package OOP.Java_53;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// kieu nguyen thuy
		
		int arr1[] = {1, 2, 3};
		
		// coppy mang 
		//1. gán -> khi thay đổi mảng cũ cũng bị thay đổi
//		int[] arrCopy = arr1;
// 		arrCopy[0] = 100;
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arrCopy));
		
		// dùng hàm clone
		int[] arrCopy1 = arr1.clone();
		arrCopy1[0] = 50;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arrCopy1));
		
		// arrCopy  cach 3
		int[] arrCopy3 = new int[arr1.length];
		System.arraycopy(arr1, 0, arrCopy3, 0, arr1.length);
		arrCopy3[0] = 90;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arrCopy3));
		
	}
}
