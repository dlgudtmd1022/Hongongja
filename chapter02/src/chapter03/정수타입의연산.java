package chapter03;

public class 정수타입의연산 {

	public static void main(String[] args) {
		byte r1 = 10 + 20;
		System.out.println(r1);
		
		// byte끼리의 연산에서도 저장받는 변수가 int타입이므로 자동으로 변환되어 저장됨
		byte x = 10;
		byte y = 20;
		int r2 = x + y;
		System.out.println(r2);
	}
}
