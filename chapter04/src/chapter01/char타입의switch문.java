package chapter01;

public class char타입의switch문 {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A' :
		case 'a' :
			System.out.println("우수 회원입니다.");
		case 'B' :
		case 'b' :
			System.out.println("일반 회원입니다.");
		default : 
			System.out.println("손님입니다.");
		}
	}
}
