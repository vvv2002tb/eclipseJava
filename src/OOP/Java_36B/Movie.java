package OOP.Java_36B;

public class Movie {
	private String nameMovie;
	private int yearProduction;
	private Brand brandMovie;
	private double priceTicket;
	private DatePublic datePublic;
	
	public Movie(String nameMovie, int yearProduction, Brand brandMovie, double priceTicket, DatePublic datePublic) {
		this.nameMovie = nameMovie;
		this.yearProduction = yearProduction;
		this.brandMovie = brandMovie;
		this.priceTicket = priceTicket;
		this.datePublic = datePublic;
	}

	public String getNameMovie() {
		return nameMovie;
	}

	public void setNameMovie(String nameMovie) {
		this.nameMovie = nameMovie;
	}

	public int getYearProduction() {
		return yearProduction;
	}

	public void setYearProduction(int yearProduction) {
		this.yearProduction = yearProduction;
	}

	public Brand getBrandMovie() {
		return brandMovie;
	}

	public void setBrandMovie(Brand brandMovie) {
		this.brandMovie = brandMovie;
	}

	public double getPriceTicket() {
		return priceTicket;
	}

	@Override
	public String toString() {
		return "Movie [nameMovie=" + nameMovie + ", yearProduction=" + yearProduction + ", brandMovie=" + brandMovie
				+ ", priceTicket=" + priceTicket + ", datePublic=" + datePublic + "]";
	}

	public void setPriceTicket(double priceTicket) {
		this.priceTicket = priceTicket;
	}

	public DatePublic getDatePublic() {
		return datePublic;
	}

	public void setDatePublic(DatePublic datePublic) {
		this.datePublic = datePublic;
	}
	
	public boolean checkRandomPrice(Movie otherMovie) {
		return this.priceTicket < otherMovie.priceTicket;
	}
	
	public String displayNameBrand() {
		return this.brandMovie.getNameBrand();
	}
	
	
	public double priceAfterSale(double xPercen) {
		return this.priceTicket*(1-xPercen/100);
	}
	
	public String fullDatePublic() {
		return datePublic.getDay() + "/" +  datePublic.getMonth() + "/" +  datePublic.getYear();
		
	}
	
}
