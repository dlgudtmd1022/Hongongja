package chapter04;

public class 입력된키의개수와상관없이키코드읽기 {

	public static void main(String[] args) throws Exception{
		int kC;
		
		
		while(true) {
			kC = System.in.read();
			System.out.println("keyCode : " + kC);
		}
	}
}
