package chapter01.ex2;

public class StudentExample {

	public static void main(String[] args) {
		Student st = new Student("홍길동","123456-1234567", 1);
		System.out.println("name : " + st.name);
		System.out.println("ssn : " + st.ssn);
		System.out.println("sN : " + st.sN);
	}
}
