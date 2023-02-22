package OOP.Java_45;

public class Car extends Vehice{
	private String nameFuel;

	

	public Car(BrandProduct brandProduct, String nameFuel) {
		super("E200", brandProduct);
		this.nameFuel = nameFuel;
	}

	public String getNameFuel() {
		return nameFuel;
	}

	public void setNameFuel(String nameFuel) {
		this.nameFuel = nameFuel;
	}

	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return 100;
	}
	
	
}
