package sec03.exam04;

public class LongOperationExam {

	public static void main(String[] args) {

		//long result = [long타입] 연산자(+,-,*,/,%) [byte,char,short,int타입]
		//int타입보다 허용범위가 더 큰 long타입이 피연산자로 사용되면 
		//다른 피연산자는 무조건 long타입으로 변환하고 연산을 수행한다.
		//따라서 연산결과를 long타입 변수에 저장해야한다.
		
		byte value1=10;
		int value2=100;
		long value3=1000L;
		long result=value1+value2+value3;// 
		System.out.println(result);

	}

}
