package sec02.exam09;

public class BreakOutterExam {
	public static void main(String[] args) {
		//바깥쪽 for문은 A~Z까지 반복하고 중첩된 for문은 a~z까지 반복하는데
		//중첩 for문에서 lower 변수가 g를 갖게되면 바깥for문까지 빠져나오도록 했다.
		
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}
}
