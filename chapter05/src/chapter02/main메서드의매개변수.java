package chapter02;

public class main메서드의매개변수 {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);
		}
		
		String sN1 = args[0];
		String sN2 = args[1];
		
		
		int n1 = Integer.parseInt(sN1);
		int n2 = Integer.parseInt(sN2);
	
		int r = n1 + n2;
		System.out.println(n1 + " + " + n2 +  " = " + r);
	}
}
