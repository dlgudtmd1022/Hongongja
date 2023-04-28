package Class_;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("장자바", "890812-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
				
		Korean k2 = new Korean("신자바", "950615-1234567");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
		
	}

}
