package sec01.exam03;

public class IfElseIfExam {

	public static void main(String[] args) {
		int score=75;
		
		if(score>=90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A입니다.");
		}else if(score>=80) {//80<=score<90인 경우
			System.out.println("점수가 80-89입니다.");
			System.out.println("등급은 B입니다.");
		}else if(score>=70){//70<=score<80인 경우
			System.out.println("점수가 70-79입니다.");
			System.out.println("등급은 C입니다.");
		}else {//score<70인 경우
			System.out.println("점수가 70 미만입니다.");
			System.out.println("등급은 D입니다.");
		}

	}

}