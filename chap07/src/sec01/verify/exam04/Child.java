package sec01.verify.exam04;

public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int studentNo) {
		super(name);//부모 클래스의 생성자 호출
		this.studentNo=studentNo;
	}
	
	/*
	 * Child 클래스의 생성자에서 this.name=name 코드가 에러를 일으키는
	 *  이유는 name 필드가 Parent 클래스의 인스턴스 변수인데, Child 클래스에서는
	 *   name 필드를 직접 참조할 수 없기 때문입니다.
	 */
}
