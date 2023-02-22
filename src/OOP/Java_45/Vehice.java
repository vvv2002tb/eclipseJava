package OOP.Java_45;

public abstract class Vehice {
	protected String nameVehice;
	protected BrandProduct brandProduct;

	

	public Vehice(String nameVehice, BrandProduct brandProduct) {
		this.nameVehice = nameVehice;
		this.brandProduct = brandProduct;
	}

	public String getNameVehice() {
		return nameVehice;
	}

	public void setNameVehice(String nameVehice) {
		this.nameVehice = nameVehice;
	}
	
	
	public String displayBrandName() {
		return this.brandProduct.getNameBrand();
	}
	
	public void start() {
		System.out.println("starting....");
	}
	
	public void speedUp() {
		System.out.println("Tang toc...");
	}
	public void stop() {
		System.out.println("Stoped....");
	}
	
	public abstract double getSpeed();
	
	
	
	
	
	
	
}
