package sec01.exam01;
//예외 클래스-실행예외
public class NullPointerExceptionExam {

	public static void main(String[] args) {
		String data=null;
		System.out.println(data.toString());

	}
	//6라인에서 data 변수는 null값을 가지고 있기 때문에 String 객체를 참조하고
	//있지 않는다. 하지만 7번 라인에서 String 객체의 toString()메소드를 호출
	//하고 있다. 여기서 NullPointer Exception이 발생한다.

}
