package sec03.exam02;

public class Korean {
	// 생성자에서 필드 초기화
	// 필드
	String nation="대한민국";
	String name;
	String ssn;
	
	// 생성자
	public Korean(String n, String s) {
		name=n;
		ssn=s;
	}
	
	//Korean 생성자의 매개 변수 이름은 각각 n과 s를 사용했다.
	//매개 변수의 이름이 너무 짧으면 코드의 가독성이 좋지 않기 때문에 가능하면 초기화 시킬 필드 이름과 비슷하거나
	//동일한 이름을 사용하는 것이 좋다. 일반적으로 통상적으로 필드와 동일한 이름을 갖는 매개 변수를 사용한다.
	//그러나 이 경우 필드와 매개 변수 이름이 동일하기 때문에 생성자 내부에서 해당 필드에 접근 불가하다
	//왜냐, 동일한 이름의 매개변수가 사용 우선순위가 높기때문. 해결방법은 필드앞에'this.'을 붙이면 된다.
	//this는 객체 자신의 참조인데, 우리가 우리 자신을 '나'라고 하듯이 객체가 객체 자신을 this라 한다.
	//this.필드는 this라는 참조변수로 필드를 사용하는 것과 동일하다.
}
