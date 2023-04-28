package chapter04;

public class ComputerExample {

	public static void main(String[] args) {
		
		Computer mC = new Computer();
		
		int[]values1 = {1, 2, 3};
		int result1 = mC.sum(values1);
		System.out.println(result1);
	
		int result2 = mC.sum(new int[] {1,2,3,4,5});
		System.out.println(result2);
		
//		int result3 = mC.sum2(1,2,3);
//		System.out.println(result3);
//		
//		int result4 = mC.sum2(1,2,3,4,5);
//		System.out.println(result4);
	
	
	}
}
