package sec01.exam02;
//ArrayIndexOutBoundException
//배열에서 인덱스 범위를 초과할 경우 실행 예외인 ArrayIndexOutBoundException이 발생
public class ArrayIndexOutBoundExceptionExam {

	public static void main(String[] args) {
		String data1=args[0];
		String data2=args[1];
		
		System.out.println(data1);
		System.out.println(data2);

	}
	//7라인에서 ArrayIndexOutBoundException이 발생
	//2개의 실행 매개값을 주지 않았기 때문에 args[0],args[1]과 같이
	//인덱스를 사용할 수 없기 때문
}
