package OOP.Java_44;

public class Rectangle extends Shape {
	private double chieuRong, chieuCao;

	public Rectangle(ToaDo toaDo, double chieuRong, double chieuCao) {
		super(toaDo);
		this.chieuRong = chieuRong;
		this.chieuCao = chieuCao;
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}

	public double getChieuCao() {
		return chieuCao;
	}

	public void setChieuCao(double chieuCao) {
		this.chieuCao = chieuCao;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return chieuCao*chieuRong;
	}
	
	
	
}
