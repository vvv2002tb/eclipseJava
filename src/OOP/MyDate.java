package OOP;

public class MyDate {
	private int day;
	private int month;
	private int year;
	public MyDate() {
		
	}
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void printDay() {
		System.out.println("Day: " + this.day);
	}
	
	
	

}
