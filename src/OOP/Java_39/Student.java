package OOP.Java_39;

public class Student extends Person {
	private int studentId;
	private String className;
	
	
	public Student(String name, int birthDay, int studentId, String className) {
		super(name, birthDay);
		this.studentId = studentId;
		this.className = className;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getClassName() {
		return className;
	}


	public void setClassName(String className) {
		this.className = className;
	}
	
	public void playGame() {
		System.out.println("Playing Game.......");
	}
	
	public void learn() {
		System.out.println("Learning.....");
	}
	
	
	
	
	
	
}
