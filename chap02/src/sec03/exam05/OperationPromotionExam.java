package sec03.exam05;

public class OperationPromotionExam {

	public static void main(String[] args) {
		byte byteValue1=10;
		byte byteValue2=20;
		//byte byteValue3=byteValue1+byteValue2; 
		//컴파일 에러(byteValue1,2는 int타입으로 변경되서 연산의 결과가 int타입으로 나오게 됨)
		int intValue1=byteValue1+byteValue2;
		System.out.println(intValue1);
		
		char charValue1='A';// A의 유니코드 65번
		char charValue2=1;
		//char charValue3=charValue1+charValue2; 컴파일에러
		//char타입의 연산결과가 int타입으로 변경됨(66=65+1)
		int intValue2=charValue1+charValue2;
		System.out.println("유니코드="+intValue2);
		System.out.println("출력문자="+(char)intValue2);
		
		int intValue3=10;
		int intValue4=intValue3/4;//원래는 2.5가 나와야하지만 int타입으로 0.5 절사
		System.out.println(intValue4);
		double doubleValue2=intValue3/4.0;
		System.out.println(doubleValue2);
		
		
		int intValue5=10;
		//int intValue6=10/4.0 컴파일에러
		double doubleValue=intValue5/4.0;
		System.out.println(doubleValue);
		
		int x=1;
		int y=2;
		double result=(double)x/y;
		System.out.println(result);
		

	}

}
