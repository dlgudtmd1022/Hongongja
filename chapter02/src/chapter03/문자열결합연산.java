package chapter03;

public class 문자열결합연산 {

	public static void main(String[] args) {
		// 숫자 연산
		int v = 10 + 2 + 8;
		System.out.println("v :" + v);
		
		//문자열 결합 연산
		String s1 = 10 + 2 + "8"; // 정수형끼리의 연산식이 먼저 끝난 후 문자열과 만나 정수형 계산 후 문자열 추가 
		System.out.println("s1 : " +s1);
		
		String s2 = "10" + 2 + 8;
		System.out.println("s2 : " +s2);
		
		String s3 = 10 + "2" + 8;
		System.out.println("s3 : " +s3);
		
		String s4 = "10" + (2+8);
		System.out.println("s4 : " + s4);
		
	}
}
