package sec03.exam03;

public class ByteOperationExam {

	public static void main(String[] args) {
		
		//int result=[byte,char,short,int타입] 연산자(+,-,*,/,%) [byte,char,short,int타입]
		
		
		byte result1=10+20;
		System.out.println(result1);
		
		byte x=10;
		byte y=20;
		
		int result2=x+y;
		System.out.println(result2);
		
		// 정수 연산식에서 모든 변수가 int 타입으로 변환되는 것은 아니다.
		// 두 피연산자 중 허용 범위가 큰 타입으로 변환되어 연산을 수행한다.
	}

}
