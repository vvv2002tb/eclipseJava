import java.util.Iterator;

public class Java_26 {
	// break, continue, return
	public static void main(String[] args) {
		/*
		 * break có 2 dạng:
		 *  dùng để thoát ra khỏi vòng
		 * di chuyển tới vùng đặt label
		 */
		
		// 1.1 unlabeled
		/*
		 * int out, in = 0; for (out = 0; out < 10; out++) { for (in = 0; in < 20; in++)
		 * { if (in > 10) break; } System.out.println("ben trong vong lap lon: out = " +
		 * out + " - in = " + in); } System.out.println("ben ngoai vong lap out: out = "
		 * + out + " - in = " + in);
		 */
		// 1.2 labeled
		/*
		 * int out1, in1 = 0; outer: for (out1 = 0; out1 < 10; out1++) { for (in1 = 0;
		 * in1 < 20; in1++) { if (in1 > 10) break outer; }
		 * System.out.println("ben trong vong lap lon: out = " + out1 + " - in = " +
		 * in1); } System.out.println("ben ngoai vong lap out: out = " + out1 +
		 * " - in = " + in1);
		 */
		
		// 2.1 continue unlabel
		/*
		 * int max = 100; for (int i = 0; i < max; i++) { if (i <50) continue;
		 * System.out.println(i); }
		 */
		// 2.2 label
		
		// return có 2 dạng 
		// trả về 1 giá trị : return a; return a++; => giá trị trả về phải phù hợp với kiểu trả về của hàm 
		// ko tra ve gt nào : return; kiểu trả về của hàm phải là void
		
		
		
		// return; dừng luôn trương trình , hàm main....
		
		
	}
}
