package chapter01;

public class if문 {

	public static void main(String[] args) {
		
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		if(score < 90) 
			System.out.println("점수가 90보다 작습니다."); // < {}괄호 없이 if문 바로 뒷 코드만 if문 으로 확인
			System.out.println("등급은 B입니다."); // < if문과는 상관없는 실행문
		
	}
}
