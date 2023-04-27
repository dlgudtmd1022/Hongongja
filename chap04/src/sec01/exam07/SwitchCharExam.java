package sec01.exam07;

public class SwitchCharExam {

	public static void main(String[] args) {
		char grade='B';
		// 알파벳 대소문자에 관계없이 동일하게 처리하도록 만들어진 코드
		
		switch(grade) {
		case'A':
		case'a':
			System.out.println("우수 회원입니다.");
			break;
		case'B':
		case'b':
			System.out.println("일반 회원입니다.");
			break;
			default:
				System.out.println("손님입니다.");
		}

	}

}
