package chapter04;

public class CcrExample {

	public static void main(String[] args) {
		Ccr  myCcr = new Ccr();
		
		//정사각형의 넓이 구하기
		double result = myCcr.aR(10);
		
		//직사각형의 넓이 구하기
		double result2 = myCcr.aR(10,20);
		
		//결과 출력
		System.out.println("정사각형" + result);
		System.out.println("정사각형" + result2);
	}
}
