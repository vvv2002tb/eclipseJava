package OOP.Java_47.Code_a;

public class Example {
	int a, b;

	public Example(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public void sum() {
		System.out.println(this.a + this.b);
	}

}
