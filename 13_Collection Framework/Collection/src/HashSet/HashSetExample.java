package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet()<String>();
		
		set.add("java");
		set.add("jdbc");
		set.add("servelet/jsp");
		set.add("java");
		set.add("ibatis");
		
		int size = set.size();
		System.out.println(size);
		
		Iterator<String>iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		set.remove("jdbc");
		set.remove("ibatis");
		
		System.out.println(set.size());
		
		iterator = set.iterator();
		for(String element : set) {
			System.out.println(element);
		}
		set.clear();
		if(set.isEmpty()) {System.out.println("비어 있음");
	}

	}
}
