package OOP.Java_45;

public class Main {
	public static void main(String[] args) {
		BrandProduct brand1 = new BrandProduct("Mecerdes", "Germany");
		BrandProduct brand2 = new BrandProduct("Santafe", "Vietnam");
		BrandProduct brand3 = new BrandProduct("Boing474", "USA");
		
		Plane pl = new Plane(brand3, "Dau mo");
		Car c1 = new Car(brand1, "water");
		Bicyle bc = new Bicyle(brand2);
		System.out.println("Plane :");
		System.out.println(pl.getNameFuel());
		System.out.println(pl.displayBrandName());
		System.out.println(pl.getSpeed() + " KM/H");
		
		System.out.println("Car :");
		System.out.println(c1.getNameFuel());
		System.out.println(c1.displayBrandName());
		System.out.println(c1.getSpeed() + " KM/H");
		
		System.out.println("Bicycle :");
		System.out.println(bc.displayBrandName());
		System.out.println(bc.getSpeed() + " KM/H");
	}

}
