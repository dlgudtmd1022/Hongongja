package sec01.exam02;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number=number;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number==compareKey.number) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return number;
	}
	
	//저장할 때의 new Key(1)과 읽을 때의 new Key(1)은 사실 서로 다른 객체이지만
	//HashMap은 hashCode()의 리턴값이 같고, equals()의 리턴값이 true가 되기 때문에
	// 동등한 객체로 평가한다. 즉, 같은 식별키로 인식한다는 뜻.
	//객체의 동등 비교를 위해서는 Object의 equals()메소드만 재정의 말고, hashCode()메소드도
	//재정의해서 논리적으로 동등한 객체일 경우 동일한 해시코드가 리턴되도록 해야한다.
	
	
	
	
}
