package chapter02;

public class 논리부정연산자 {

	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);
		
		//!를 사용하면 참,거짓 결과를 바꿔줌
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
	}
}
