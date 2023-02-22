package OOP.Java_44;

public abstract class Shape {
	protected ToaDo toaDo;

	public Shape(ToaDo toaDo) {
		this.toaDo = toaDo;
	}

	public ToaDo getToaDo() {
		return toaDo;
	}

	public void setToaDo(ToaDo toaDo) {
		this.toaDo = toaDo;
	}
	
	public abstract double tinhDienTich(); // ko hiện thực củ thể phải qua lớp con
	

}
