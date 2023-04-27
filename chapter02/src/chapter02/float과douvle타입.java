package chapter02;

public class float과douvle타입 {

	public static void main(String[] args) {
		//실수값 저장
		// float v1 = 3.14; <- 컴파일 에러
		float v2 = 3.14f;
		double v3 = 3.14;
		
		//정밀도 테스트 - double가 더 정밀하게 출력
		float v4 = 0.1234567890123456789f;
		double v5 = 0.1234567890123456789;
		
		System.out.println("v2:" + v2);
		System.out.println("v3:" + v3);
		System.out.println("v4:" + v4);
		System.out.println("v5:" + v5);
		
		//e 사용하기
		double v6 = 3e6;
		float v7 = 3e6f;
		double v8 = 2e-3;
		System.out.println("v6:" + v6);
		System.out.println("v7:" + v7);
		System.out.println("v8:" + v8);
	}
}
