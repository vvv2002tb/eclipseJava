package OOP.Java_31;

public class Main {
	public static void main(String[] args) {
		CheckOutCoffee custommer1 = new CheckOutCoffee("starbucks", 10, 20);
		System.out.println("Your monney you need pay: " +  custommer1.sumPrice() + "$");
		System.out.println("Kiem tra khoi luong > 2kg " + custommer1.checkKhoiLuong(3));
		System.out.println("kiem tra tong tien >= 100$ " + custommer1.checkSumPriceMore100());
		System.out.println("So tien duoc giam la: " + custommer1.salePercent(10) + "$");
		System.out.println("after sale if your checkout > 100$: " + custommer1.finalPriceAfterSale(10) + "$");
		System.out.println("thanks for buying!");
	}

}
