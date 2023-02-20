package OOP.Java_31;

public class CheckOutCoffee {
	String nameCoffee;
	double priceOneKillo;
	double khoiLuong;
	
	public CheckOutCoffee() {
		
	}
	
	
	public CheckOutCoffee(String nameCoffee, double priceOneKillo, double khoiLuong) {
		this.nameCoffee = nameCoffee;
		this.priceOneKillo = priceOneKillo;
		this.khoiLuong = khoiLuong;
	}
	

	public double sumPrice() {
		return (this.priceOneKillo * this.khoiLuong) ;
	}
	
	public boolean checkKhoiLuong(double khoiLuong) {
		return this.khoiLuong > khoiLuong;
	}
	
	public boolean checkSumPriceMore100() {
		return this.sumPrice() >= 100;
	}

	public double salePercent(double x) {
		if (this.checkSumPriceMore100()) {
			return (x/100) * this.sumPrice();
		} else {
			return 0;
		}
	}
	
	public double finalPriceAfterSale(double x) {
		return this.sumPrice() - this.salePercent(x);
	}
	

}
