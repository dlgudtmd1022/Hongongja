package sec02.exam02;

public class ChildExam {//자동 타입 변환 후의 멤버 접근

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; //자동 타입 변환
		parent.method1();
		parent.method2();// 재정의 된 메소드 호출가능
		//parent.method3(); 호출 불가

	}

}
