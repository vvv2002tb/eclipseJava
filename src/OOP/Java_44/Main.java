package OOP.Java_44;

public class Main {
	public static void main(String[] args) {
		ToaDo td1 = new ToaDo(5, 5);
		ToaDo td2 = new ToaDo(7, 9);
		ToaDo td3 = new ToaDo(12, 1);
		
//		Shape h = new Shape(td1); => lỗi biên dịch 
		Shape h1 = new Point(td1);
		Shape h2 = new Circle(td2, 10);
		Shape h3 = new Rectangle(td3, 10, 50);
		
		System.out.println("Dien tich h1: " + h1.tinhDienTich() + " cm2");
		System.out.println("Dien tich h2: " + h2.tinhDienTich() + " cm2");
		System.out.println("Dien tich h3: " + h3.tinhDienTich() + " cm2");
		
	}
}
