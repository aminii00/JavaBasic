package _230502_1_Collection_List;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class prac {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("a");
		set.add("b");
		
		System.out.println(set.size());
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String b= it.next();
			System.out.println(b);
		}
		
		set.remove("a");
		System.out.println(set);
		set.clear();
		
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
	}

}
