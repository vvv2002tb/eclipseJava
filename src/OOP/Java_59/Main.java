package OOP.Java_59;

public class Main {
	public static void main(String[] args) {
		ThoiKhoaBieu thuHai = new ThoiKhoaBieu(Day.Monday, "TOAN VAN ANH");
		ThoiKhoaBieu thuBa = new ThoiKhoaBieu(Day.Tuesday, "TOAN VAN ANH");
		
		System.out.println(thuHai.toString());
	}
}
