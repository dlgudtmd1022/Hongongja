package chapter01;

public class 변수값교환 {

	public static void main(String[] args) {
		// 변수에 초기값 설정
		int x = 3;
		int y= 5;
		System.out.println("x : "  + x + " / y : " + y);

		// temp에 x값(3) 대입
		int temp = x;
		// x에 y값(5) 대입
		x = y;
		// y에 temp값 (3)대입
		y = temp;
		System.out.println("x : "  + x + " / y : " + y);
	
	
	}
}
