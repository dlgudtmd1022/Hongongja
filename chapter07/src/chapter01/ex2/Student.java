package chapter01.ex2;

public class Student extends People{
	public int sN;
	
	public Student(String name, String ssn, int sN) {
		super(name, ssn);
		this.sN = sN;
	}

}
