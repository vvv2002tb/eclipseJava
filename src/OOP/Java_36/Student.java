package OOP.Java_36;

public class Student {
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", nameStudent=" + nameStudent + ", birthDay=" + birthDay
				+ ", scoreAverage=" + scoreAverage + ", className=" + className + "]";
	}




	private int studentId;
	private String nameStudent;
	private Date birthDay;
	private double scoreAverage;
	private ClassName className;
	
	
	
	
	public Student(int studentId, String nameStudent, Date birthDay, double scoreAverage, ClassName className) {
		this.studentId = studentId;
		this.nameStudent = nameStudent;
		this.birthDay = birthDay;
		this.scoreAverage = scoreAverage;
		this.className = className;
	}

	


	public int getStudentId() {
		return studentId;
	}




	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}




	public String getNameStudent() {
		return nameStudent;
	}




	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}




	public Date getBirthDay() {
		return birthDay;
	}




	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}




	public double getScoreAverage() {
		return scoreAverage;
	}




	public void setScoreAverage(double scoreAverage) {
		this.scoreAverage = scoreAverage;
	}




	public ClassName getClassName() {
		return className;
	}




	public void setClassName(ClassName className) {
		this.className = className;
	}




	public void displayNameDepartment() {
		System.out.println(className.getNameDerpartment());
	}
	
	public boolean checkScoreMoreFive() {
		return this.scoreAverage >= 5;
	}
	
	
	
	
}
