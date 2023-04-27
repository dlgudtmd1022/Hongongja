package chapter01;

public class 변수초기화 {

	public static void main(String[] args) {
		//변수 value 선언
		int value;
		// 변수 value 초기값 설정
		value = 10;
		
		// int value = 10; 위 두줄 코드를 한줄로 입력 가능
		
		//변수 value 값을 읽고 10을 더하는 산술 연살을 수행
		// 연산의 결과값을 변수 result의 초기값으로 저장
		int result = value + 10;
		
		//변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);
	}
}
