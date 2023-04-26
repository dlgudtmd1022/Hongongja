package chapter04;

public class q를입력하면반복종료 {

	public static void main(String[] args)throws Exception {
		int kC;
		
		while(true) {
			kC = System.in.read();
			System.out.println("keyCord: " + kC);
			if(kC == 113) {
				break;
			}
		}
		System.out.println("종료");
	}
}
