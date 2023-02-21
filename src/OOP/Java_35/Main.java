package OOP.Java_35;

public class Main {
	public static void main(String[] args) {
		Date date1 = new Date(15, 5, 2021);
		Date date2 = new Date(11, 9, 2020);
		Date date3 = new Date(15, 9, 2025);
		
		Author tacGia1 = new Author("MrV889", date1);
		Author tacGia2 = new Author("ThuTrang", date2);
		Author tacGia3 = new Author("Bon", date3);
		
		Book sach1 = new Book("C++", 50, 2023, tacGia1);
		Book sach2 = new Book("Java", 200, 2023, tacGia2);
		Book sach3 = new Book("MySQL", 100, 2029, tacGia3);
		
		sach1.printNameBook();
		sach2.printNameBook();
		sach3.printNameBook();
		
		System.out.println(sach1);
		System.out.println(sach2);
		System.out.println(sach3);
	
		
		System.out.println("so sanh nam xuat ban sach 1 va 2: " + sach1.checkSameYear(sach2));
		System.out.println("so sanh nam xuat ban sach 1 va 3: " + sach1.checkSameYear(sach3));
		
		System.out.println("sach1 sau khi giam 10%: " +sach1.priceAfterSale(10));
		System.out.println("sach1 sau khi giam 10%: " +sach2.priceAfterSale(10));
		System.out.println("sach1 sau khi giam 10%: " +sach3.priceAfterSale(10));
	}
}
