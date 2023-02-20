package OOP.Java_35;

public class Book {
	private String nameBook;
	private double price;
	private int yearPublic;
	private Author author ;
	public Book(String nameBook, double price, int yearPublic, OOP.Java_35.Author author) {
		this.nameBook = nameBook;
		this.price = price;
		this.yearPublic = yearPublic;
		this.author = author;
	}
	public String getNameBook() {
		return nameBook;
	}
	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getYearPublic() {
		return yearPublic;
	}
	public void setYearPublic(int yearPublic) {
		this.yearPublic = yearPublic;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public void printNameBook() {
		System.out.println("name book: " + this.getNameBook());
	}
	
	public boolean checkSameYear(Book otherBook) {
//		if(this.yearPublic == otherBook.yearPublic ) {
//			return true;
//		} else {
//			return false;
//		}
		
		return this.yearPublic == otherBook.yearPublic;
	}
	
	public double priceAfterSale(double xPercent) {
		return this.price*(1-xPercent/100);
	}
	
	
	
	

}
