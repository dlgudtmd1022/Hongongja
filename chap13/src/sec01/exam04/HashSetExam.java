package sec01.exam04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//String객체를 중복 없이 저장하는 HashSet
public class HashSetExam {
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		
		set.add("Java");//"Java"는 한 번만 저장됨
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");

		int size=set.size();
		System.out.println("총 객체수: "+size);
		
		Iterator<String> iterator=set.iterator();//반복자 얻기
		while(iterator.hasNext()) {//객체 수 만큼 루핑
			String element=iterator.next();//1개의 객체를 가져옴
			System.out.println("\t"+element);
		}
		
		set.remove("JDBC");//1개의 객체 삭제
		set.remove("iBATIS");//1개의 객체 삭제
		
		System.out.println("총 객체수: "+set.size());//저장된 객체 수 얻기
		
		iterator=set.iterator();//반복자 얻기
		for(String element:set) {
			System.out.println("\t"+element);//객체 수 만큼 루핑
		}
		
		set.clear();//모든 객체를 제거하고 비움
		if(set.isEmpty()) {System.out.println("Empty");}
		
	}

}
