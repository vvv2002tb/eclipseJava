package OOP.Java_55;

public class Student implements Comparable<Student>{
	private int studentId;
	private String fullName;
	private String className;
	private double diemTrungBinh;
	
	public Student(int studentId, String fullName, String className, double diemTrungBinh) {
		this.studentId = studentId;
		this.fullName = fullName;
		this.className = className;
		this.diemTrungBinh = diemTrungBinh;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	
	public String getName() {
		String s = this.fullName.trim();
		if (s.indexOf(" ")>=0) {
			int index = s.lastIndexOf(" ");
			return s.substring(index + 1);
		} else {
			return s;
		}
	}

	

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		// <0 đtg this < dtuong o hay con goi la other
		// =0 = nhau 
		// >0 đtg this > dtuong o hay con goi la other
//		return this.studentId - o.studentId;
		
		
//		String nameThis = this.getName();
//		String nameO = o.getName();
//		return nameThis.compareTo(nameO);
		int epKieu = (int) this.diemTrungBinh - (int) o.diemTrungBinh;
		return epKieu;
		
		
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", fullName=" + fullName + ", className=" + className
				+ ", diemTrungBinh=" + diemTrungBinh + "]";
	}
	
	
	
	
	
}
