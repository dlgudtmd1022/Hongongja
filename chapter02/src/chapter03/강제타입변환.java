package chapter03;

public class 강제타입변환 {

	public static void main(String[] args) {
		// 변환할 타입을 ()괄호 안에 넣어 변환
		int iv= 44032;
		char cv = (char)iv;
		System.out.println(cv);
		
		long lv = 500;
		iv = (int)lv;
		System.out.println(iv);
		
		double dv = 3.14;
		iv = (int)dv;
		System.out.println(iv);
	}
}
