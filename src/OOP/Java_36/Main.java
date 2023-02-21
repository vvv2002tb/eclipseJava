package OOP.Java_36;

public class Main {
	public static void main(String[] args) {
		ClassName class1 = new ClassName("K65E2", "CNTT");
		Date myDate = new Date(13, 4, 2002);
		Date friendDate = new Date(20, 12, 2002);
		Date hoangDate = new Date(13, 4, 2002);
		Student std1 = new Student(1, "Doan vinh", myDate, 8.0, class1);
		Student std2 = new Student(2, "Phuong an lon ", friendDate, 2.0, class1);
		Student std3 = new Student(3, "Bongmai an cut", hoangDate, 9.0, class1);
		System.out.println(std1);
		std1.displayNameDepartment();
		
		System.out.println("diem trung binh >= 5: " + std1.checkScoreMoreFive());
		
		System.out.println("so sanh ngay sinh std1 vs st2: " + std1.getBirthDay().equals(std2.getBirthDay()));
		System.out.println("so sanh ngay sinh std1 vs st3: " + std1.getBirthDay().equals(std3.getBirthDay()));
		
		
	}
}
