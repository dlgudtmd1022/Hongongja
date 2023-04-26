package chapter02;

public class 부호연산자 {

	public static void main(String[] args) {
		int x = -100;
		int r1 = +x;
		int r2 = -x;
		System.out.println("result1 = " + r1);
		System.out.println("result2 = " + r2);
	
		byte b = 100;
		// btte r3 = -b; < byte타입 값으로 부호 연산하면 int타입 값으로 바뀌므로 컴파일 에러 발생
		int r3 = -b;
		System.out.println("result3 = " + r3);
	
	}
}
