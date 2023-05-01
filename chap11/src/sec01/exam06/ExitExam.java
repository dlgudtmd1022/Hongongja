package sec01.exam06;
//Exit()메소드
public class ExitExam {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i==5) {
				//System.exit(0);
				break;
			}
		}
		System.out.println("마무리코드");
	}

	//System.exit(0);은 프로그램을 강제 종료하므로 7라인에서 실행하면 11라인은 출력되지 않는다.
	//만약 프로그램이 종료될 때 꼭 11라인을 실행해야 한다면 System.exit(0)대신 for문을
	//빠져나오는 break문을 사용하는것이 좋다. 7라인 8라인을 번갈아가며 주석 처리하고 실행해보자
}
