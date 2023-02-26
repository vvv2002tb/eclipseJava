package OOP.Java_61;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private String studentId;
	private String fullName;
	private int year;
	
	private float diemTrungBinh;
	public Student(String studentId) {
		this.studentId = studentId;
	}
	
	public Student(String studentId, String fullName, int year, float diemTrungBinh) {
		this.studentId = studentId;
		this.fullName = fullName;
		this.year = year;
		this.diemTrungBinh = diemTrungBinh;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public float getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(float diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", fullName=" + fullName + ", year=" + year + ", diemTrungBinh="
				+ diemTrungBinh + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.studentId.compareTo(o.studentId);
	}
	@Override
	public int hashCode() {
		return Objects.hash(studentId);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(studentId, other.studentId);
	}
	
	
	
	
	
	
}
