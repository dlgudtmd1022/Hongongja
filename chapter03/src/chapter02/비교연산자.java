package chapter02;

public class 비교연산자 {

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 10;
		boolean r1 = (n1 == n2);
		boolean r2 = (n1 != n2);
		boolean r3 = (n1 <= n2);
		System.out.println("result = " + r1);
		System.out.println("result = " + r2);
		System.out.println("result = " + r3);
	
		char c1 = 'A';
		char c2 = 'B';
		boolean r4 = (c1 < c2);
		System.out.println("result = " + r4);
	}
}
