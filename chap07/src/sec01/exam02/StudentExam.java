package sec01.exam02;

public class StudentExam {//자식 객체 이용

	public static void main(String[] args) {
		Student student = new Student("홍길동", "132456-1234567", 1);
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);

	}

}
