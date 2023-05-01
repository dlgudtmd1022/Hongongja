package sec01.exam04;

public class NumberFormatExceptionExam {

	public static void main(String[] args) {
		String data1="100";
		String data2="a100";
		
		int value1=Integer.parseInt(data1);
		int value2=Integer.parseInt(data2);//NumberFormatException발생
		
		int result = value1+value2;
		System.out.println(data1+"+"+data2+"="+result);

	}
	
	//data1변수의 "100"문자열은 숫자로 변환이 가능하기때문에 9라인이 정상적으로 실행되지만,
	//data2변수의 "a100"문자열은 숫자로 변환할 수 없기 때문에 10라인에서 NumberFormatException이 발생한다

}
