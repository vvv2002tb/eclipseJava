import java.util.Scanner;

public class Java_27 {
	// cách bắt lỗi ngoại lệ bằng try catch finally
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		try {
			System.out.printf("nhap vao so nguyen n: ");
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Nhap du lieu khong dung");
		} finally {
			System.out.println("lỗi hay không vẫn chạy lệnh này");
		}
		System.out.println("gia tri nhap la " + n);
		System.out.println("End process");

	}
}
