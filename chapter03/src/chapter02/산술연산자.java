package chapter02;

public class 산술연산자 {

	public static void main(String[] args) {
		
		int v1 = 5;
		int v2 = 2;
		
		int r1 = v1 + v2;
		System.out.println("result1 = " + r1);

		int r2 = v1 - v2;
		System.out.println("result2 = " + r2);
		
		int r3 = v1 * v2;
		System.out.println("result3 = " + r3);
		
		int r4 = v1 / v2;
		System.out.println("result4 = " + r4);

		int r5 = v1 % v2;
		System.out.println("result5 = " + r5);
		
		double r6 = (double) v1/v2;
		System.out.println("result6 = " + r6);
	}
}
