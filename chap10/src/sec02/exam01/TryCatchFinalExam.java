package sec02.exam01;
//일반 예외 처리
public class TryCatchFinalExam {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}

}
