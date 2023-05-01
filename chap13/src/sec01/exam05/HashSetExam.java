package sec01.exam05;

import java.util.HashSet;
import java.util.Set;

//Member객체를 중복 없이 저장하는 HashSet
public class HashSetExam {
	public static void main(String[] args) {
		Set<Member> set=new HashSet<Member>();
		
		set.add(new Member("홍길동",30));//인스턴스는 다르지만 내부 데이터가 동일하므로 객체 1개만 저장
		set.add(new Member("홍길동",30));		
		
		System.out.println("총 객체수: "+set.size());//저장된 객체 수 얻기

	}

}
