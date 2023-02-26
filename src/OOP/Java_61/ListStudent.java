package OOP.Java_61;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ListStudent {
	private ArrayList<Student> list;
	
	public ListStudent()  {
		this.list  = new ArrayList<Student>();
	}

	public ListStudent(ArrayList<Student> list) {
		this.list = list;
	}

	public ArrayList<Student> getList() {
		return list;
	}

	public void setList(ArrayList<Student> list) {
		this.list = list;
	}
	
	public void addStudent(Student std) {
		this.list.add(std);
	}
	
	
	// in 
	public void displayData() {
		for (Student student : list) {
			System.out.println(student);
		}
	}
	
	// check isEmpty
	public boolean checkIsEmpty() {
		return this.list.isEmpty();
	}
	
	// check so luong sv 
	public int getQuantityOfStudent() {
		return this.list.size();
	}
	
	public void makeEmptyList() {
		this.list.removeAll(this.list);
		System.err.println("Delete Success");
	}
	public boolean checkIdStudent(Student std) {
		return this.list.contains(std);
		
		
	}
	
	public boolean deleteIdStudent(Student std) {
		return this.list.remove(std);
	}
	
	
	public void findByName(String name) {
		for (Student student : this.list) {
			if (student.getFullName().indexOf(name) >= 0) {
				System.out.println(student);
			}
		}
	}
	
	
	public void sapXepDiem() {
		Collections.sort(this.list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getDiemTrungBinh() < o2.getDiemTrungBinh()) {
					return -1;
				} else if (o1.getDiemTrungBinh() > o2.getDiemTrungBinh()) {
					return 1;
				} else {
					return 0;
				}
			}
			
		});
	}

	@Override
	public String toString() {
		return "ListStudent [list=" + list + "]";
	}
	
	
	
}
