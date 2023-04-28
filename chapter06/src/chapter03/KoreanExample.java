package chapter03;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("박자바", "010101-1234567");
		System.out.print(k1.name);
		System.out.println(k1.ssn);
		
		Korean k2 = new Korean("김자바", "020202-122334");
		System.out.print(k2.name);
		System.out.println(k2.ssn);
		
	}
}
