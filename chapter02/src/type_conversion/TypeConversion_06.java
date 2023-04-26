package type_conversion;

public class TypeConversion_06 {

	public static void main(String[] args) {
		//숫자연산
		int Value = 10 + 2 + 8;
		System.out.println("value : " + Value);
		
		//문자열 결합 연산
		String str1 = 10 + 2 + "8";
		System.out.println("str1 : " + str1);
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2 : " + str2);
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3 : " + str3);
		
		String str4 = "10" + (2 + 8);
		System.out.println("str4 : " + str4);
		
		
	}

}
