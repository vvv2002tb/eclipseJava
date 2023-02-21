package OOP.Java_36;

public class ClassName {
	private String nameClass;
	private String nameDerpartment;
	
	
	public ClassName(String nameClass, String nameDerpartment) {
		this.nameClass = nameClass;
		this.nameDerpartment = nameDerpartment;
	}


	public String getNameClass() {
		return nameClass;
	}


	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}


	public String getNameDerpartment() {
		return nameDerpartment;
	}


	public void setNameDerpartment(String nameDerpartment) {
		this.nameDerpartment = nameDerpartment;
	}


	@Override
	public String toString() {
		return "ClassName [nameClass=" + nameClass + ", nameDerpartment=" + nameDerpartment + "]";
	}


	
	
	
	

}
