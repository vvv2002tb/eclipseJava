package OOP.Java_61;

import java.util.Scanner;



public class Main {
	public static void main(String[] args) {		
		ListStudent list1 = new ListStudent();								
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("---------Menu----------");
			System.out.println(
					"1. Them sinh vien vao danh sach. \n" + 
					"2. In danh sach sinh vien. \n" + 
					"3. Kiem tra danh sach sinh vien rong hay khong. \n" +
					"4. Kiem tra so luong sinh vien. \n" + 
					"5. Xoa toan bo sinh vien trong danh sach. \n" + 
					"6. Kiem tra sinh vien co ton tai dua vao ma sinh vien. \n" + 
					"7. Xoa sinh vien dua vao ma sinh vien. \n" + 
					"8. Tim sinh vien dua vao ten sinh vien. \n" + 
					"9. Sap xep sinh vien. \n" + 
					"10. Exit. \n" 
					);
			System.out.print("Moi lua chon: ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: {
				case1(sc, list1);
				break;
			}
			case 2: {
				showData(list1);
				break;
			}
			case 3: {
				checkListIsEmpty(list1);
				break;
			}
			case 4: {
				getSize(list1);
				break;
			}
			
			case 5: {
				deleteAll(list1);
				break;
			}
			case 6: {
				check(sc, list1);
				break;
			}
			case 7: {
				deleteOne(sc, list1);
				break;
			}
			case 8: {
				findName(sc, list1);
				break;
			}
			case 9: {
				sapXepTangDan(list1);
				break;
			}
			case 10: {
				System.err.println("Ban da thoat!");
				System.exit(0);
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		} while (true);
		
		
 		
		
		
	}
	
	static void case1(Scanner sc, ListStudent list1) {
		sc.nextLine();
		System.out.print("Nhap ma sinh vien: ");
		String studentId = sc.nextLine();
		System.out.print("Nhap ho va ten: ");
		String fullName = sc.nextLine();
		System.out.print("Nhap nam sinh: ");
		int year = sc.nextInt();
		System.out.print("Nhap diem trung binh: ");
		float diemTrungBinh = sc.nextFloat();
		Student std = new Student(studentId, fullName, year, diemTrungBinh);
		 list1.addStudent(std);
	}
	
	static void showData(ListStudent list1) {
		list1.displayData();
	}
	
	static void checkListIsEmpty(ListStudent list1) {
		if (list1.checkIsEmpty() == true) {
			System.out.println("List sinh vien rong!");
		} else {
			System.out.println("List da co sinh vien!");
		}
	}
	
	static void getSize(ListStudent list1) {
		if (list1.getQuantityOfStudent() == 0) {
			System.out.println("Chua co sinh vien nao!");
		} else {
			System.out.println("So sinh vien co trong list la " +  list1.getQuantityOfStudent());
		}
	} 
	
	static void deleteAll(ListStudent list1) {
		list1.makeEmptyList();
	}
	
	static void check(Scanner sc, ListStudent list1) {
		String msv;
		sc.nextLine();
		System.out.print("Nhap ma sinh vien muon check: ");
		msv = sc.nextLine();
		Student std = new Student(msv);
		System.out.println(list1.checkIdStudent(std));
	}
	
	static void deleteOne(Scanner sc, ListStudent list1) {
		String msv;
		sc.nextLine();
		System.out.print("Nhap ma sinh vien muon xoa: ");
		msv = sc.nextLine();
		Student std = new Student(msv);
		System.out.println(list1.deleteIdStudent(std));
	}
	
	static void findName(Scanner sc, ListStudent list1) {
		String nameNeedFind;
		sc.nextLine();
		System.out.print("Nhap ma sinh vien muon tim: ");
		nameNeedFind = sc.nextLine();
		list1.findByName(nameNeedFind);
	}
	
	static void sapXepTangDan(ListStudent list1) {
		list1.sapXepDiem();
		list1.displayData();
	}
	
	
	
	
	
	
}
