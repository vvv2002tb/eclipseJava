package OOP.Java_44;

public class Circle extends Shape {
	private double r;
	
	public Circle(ToaDo toaDo, double r) {
		super(toaDo);
		// TODO Auto-generated constructor stub
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return Math.PI*r*r;
	}

}
