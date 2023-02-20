package OOP.Java_30;

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
	
	public void printMonth() {
		System.out.println("Day: " + this.month);
	}
	
	public void printYear() {
		System.out.println("Day: " + this.year);
	}
	
	public void printDate() {
		System.out.println("date: " + this.day + " - " + this.month +  " - " + this.year );
	}
	
	
	

}
