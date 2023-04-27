package chapter02;

public class 일부터100까지합을출력for {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100 합 :" + sum);
	}
}
