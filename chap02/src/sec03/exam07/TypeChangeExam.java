package sec03.exam07;

public class TypeChangeExam {

	public static void main(String[] args) {
		// 프로그램에서 문자열을 기본타입으로 변환하는 경우가 많다.
		// ex) "12"와 "3.5"를 정수 및 실수 타입으로 변환해서 숫자 연산을 하는경우
		
		String str1="10";
		byte value=Byte.parseByte(str1);
		System.out.println(str1);
		
		String str2="200";
		short value1 = Short.parseShort(str2);
		System.out.println(str2);
		
		String str3="300000";
		int value2 = Integer.parseInt(str3);
		System.out.println(str3);
		
		String str4="40000000000";
		long value3 = Long.parseLong(str4);
		System.out.println(str4);
		
		String str5="12.345";
		float value4=Float.parseFloat(str5);
		System.out.println(str5);
		
		String str6="12.345";
		double value5=Double.parseDouble(str6);
		System.out.println(str6);
		
		String str7="true";
		boolean value6=Boolean.parseBoolean(str7);
		System.out.println(str7);
		
		//문자열이 숫자가 아닌 알파벳이나 특수문자, 한글 등을 포함하고 있을 경우
		//숫자 타입으로 변환을 시도하면 숫자형식 예외(NumberFormatException)가
		//발생하게 된다.
		

	}

}
