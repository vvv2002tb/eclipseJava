package OOP.Java_59;

public class ThoiKhoaBieu {
	private Day thu;
	private String subject;
	
	public ThoiKhoaBieu(Day thu, String subject) {
		this.thu = thu;
		this.subject = subject;
	}

	public Day getThu() {
		return thu;
	}

	public void setThu(Day thu) {
		this.thu = thu;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "ThoiKhoaBieu [thu=" + thu + ", subject=" + subject + "]";
	}
	
	
}
