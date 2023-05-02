package sec01.exam07;

import java.util.HashMap;
import java.util.Map;

//학번과 이름이 동일한 경우 같은 키로 인식
public class HashMapExam {
	public static void main(String[] args) {
		Map<Student, Integer> map=new HashMap<Student,Integer>();
		
		map.put(new Student(1,"홍길동"), 95);//학번과 이름이 동일한 Student를 키로저장
		map.put(new Student(1,"홍길동"), 95);
		
		System.out.println("총 Entry 수: "+map.size());//저장된 총 Map.Entry수 얻기

	}

}