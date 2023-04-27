package chapter02;

public class 일부터100까지합을출력whlie {

	public static void main(String[] args) {
		int sum = 0;
		
		int i = 1;
		
		while(i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("1 ~ " + (i-1) + " 합 :" + sum);
	}
}
