package sec01.exam02;

import java.util.HashMap;

//다른 키로 인식
public class KeyExam {

	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//식별키 new Key(1)로 "홍길동"을 저장함
		hashMap.put(new Key(1), "홍길동");
		
		//식별키 new Key(1)로 "홍길동"을 읽어옴
		String value = hashMap.get(new Key(1));
		System.out.println(value);

	}
	// 의도한 대로"홍길동"을 읽으려면 다음과 같이 재정의한 hashCode() 메소드를 Key클래스에 추가해야함
	// hashCode()의 리턴값을 number 필드값으로 했기 때문에 저장할 때의 new Key(1)과 읽을때
	//new Key(1)로 같은 해시코드가 리턴한다.

}
