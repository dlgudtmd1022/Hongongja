package sec01.exam01;

import java.util.ArrayList;
import java.util.List;

//String객체를 저장하는 ArrayList
public class ArrayListExam {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		list.add("Java");//String객체를 저장
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database");
		list.add("iBATIS");
		
		int size=list.size();//저장된 총 객체 수 얻기
		System.out.println("총 객체수: "+size);
		System.out.println();
		
		String skill=list.get(2);//2번 인덱스의 객체 얻기
		System.out.println("2: "+skill);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {//저장된 총 객체 수 만큼 루핑
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
		System.out.println();
		
		list.remove(2);//2번 인덱스 객체(Database)삭제
		list.remove(2);//2번 인덱스 객체(Servlet/JSP)삭제
		list.remove("iBATIS");
		
		for(int i=0; i<list.size(); i++) {//저장된 총 객체 수만큼 루핑
			String str=list.get(i);
			System.out.println(i+":"+str);
		}
		
		
		
		

	}

}
