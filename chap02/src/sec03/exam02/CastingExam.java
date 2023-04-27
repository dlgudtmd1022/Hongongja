package sec03.exam02;

public class CastingExam {

	public static void main(String[] args) {
		int intValue=44032; 
		char charValue=(char)intValue; //유니코드 44032인 '가'가 실행됨
		System.out.println(charValue);
		
		long longValue=500;
		intValue=(int)longValue; // long타입에서 int타입으로 강제 타입변환
		System.out.println(intValue);
		
		double doubleValue=3.14;
		intValue=(int)doubleValue; //double타입에서 int타입 강제 타입변환시 0.14부분 절사 후 정수인 3만 저장됨
		System.out.println(intValue);

	}

}
