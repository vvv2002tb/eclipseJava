package OOP.Java_36B;

public class Brand {
	private String nameBrand;
	private String nameNation;
	
	
	public Brand(String nameBrand, String nameNation) {
		this.nameBrand = nameBrand;
		this.nameNation = nameNation;
	}


	public String getNameBrand() {
		return nameBrand;
	}


	public void setNameBrand(String nameBrand) {
		this.nameBrand = nameBrand;
	}


	public String getNameNation() {
		return nameNation;
	}


	public void setNameNation(String nameNation) {
		this.nameNation = nameNation;
	}


	@Override
	public String toString() {
		return "Brand [nameBrand=" + nameBrand + ", nameNation=" + nameNation + "]";
	}
	
	
	
	
	
	

}
