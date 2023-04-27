package sec02.exam10;

public class AdvancedForExam {

	public static void main(String[] args) {
		// 향상된 for문-배열이나 컬렉션을 좀 더 쉽게 처리하기 위해
		// 반복된 실행을 하기 위해 루프 카운터 변수와 증감식을 사용하지 않는다
		// for문의 괄호()에는 배열에서 꺼낸 항목을 저장할 변수 선언과 콜론(:)그리고 배열을 나란히 작성한다.
		// 배열 및 컬렉션 항목의 개수만큼 반복하고, 자동적으로 for문을 빠져나간다.
		int[] scores= {95,71,84,93,87};
		
		int sum=0;
		for(int score:scores) {
			sum=sum+score;
		}
		System.out.println("점수 총합= "+sum);
		
		double avg=(double) sum/scores.length;
		System.out.println("점수평균= "+avg);

	}

}
