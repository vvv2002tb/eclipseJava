package OOP.Java_36B;

public class Main {
	public static void main(String[] args) {
		DatePublic date1 = new DatePublic(13, 04, 2022);
		DatePublic date2 = new DatePublic(23, 11, 2022);
		DatePublic date3 = new DatePublic(30, 12, 2023);
		
		Brand brand1 = new Brand("MTP ENTERTAIMENT", "VIET NAM");
		Brand brand2 = new Brand("VTV", "VIET NAM");
		Brand brand3 = new Brand("K+", "VIET NAM");
		
		Movie movie1 = new Movie("Hay trao cho anh", 2021, brand1, 10, date1);
		Movie movie2 = new Movie("Thoi su", 1990, brand2, 0, date2);
		Movie movie3 = new Movie("Ngoai hang anh", 1995, brand3, 20, date3);
		
		System.out.println("so sanh gia ve phim 1 va 3: " + movie1.checkRandomPrice(movie3));
		System.out.println("so sanh gia ve phim 1 va 2: " + movie1.checkRandomPrice(movie2));
		System.out.println(movie1.getBrandMovie());
		System.out.println(movie1.getNameMovie());
		System.out.println(movie1.displayNameBrand());
		System.err.println(movie3.priceAfterSale(10) + "$");
		System.out.println(movie2.fullDatePublic());
		
	}
}
