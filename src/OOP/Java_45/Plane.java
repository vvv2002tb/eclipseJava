package OOP.Java_45;

public class Plane extends Vehice{
	private String nameFuel;
	
	public Plane(BrandProduct brandProduct, String nameFuel) {
		super("may bay", brandProduct);
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
		return 500;
	}
	
	
	
	public void catCanh() {
		System.out.println("Cat canhing... ");
	}
	
	public void haCanh() {
		System.out.println("Ha canh");
	}
	

}
