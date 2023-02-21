package OOP.Java_35;

public class Author {
	private String nameAuthor;
	private Date birthDay;
	
	
	public Author(String nameAuthor, Date birthDay) {
		this.nameAuthor = nameAuthor;
		this.birthDay = birthDay;
	}


	public String getNameAuthor() {
		return nameAuthor;
	}


	public void setNameAuthor(String nameAuthor) {
		this.nameAuthor = nameAuthor;
	}


	public Date getBirthDay() {
		return birthDay;
	}


	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}


	@Override
	public String toString() {
		return "Author [nameAuthor=" + nameAuthor + ", birthDay=" + birthDay + "]";
	}
	
	
	
	

}
