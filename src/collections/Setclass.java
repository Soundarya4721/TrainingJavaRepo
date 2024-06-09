package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs=new HashSet<>();
		hs.add("hello");
		hs.add("hello");
		hs.add("hi");
		hs.add("bye");
		hs.add("bye");
		System.out.println(hs);
		
		for(String str:hs) {
			
			System.out.println(str);
		}
		
		Iterator it=hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		System.out.println(hs.size());
		
		
		Set <Integer> se=new HashSet<>();
		se.add(1);
		se.add(3);
		se.add(5);
		se.add(3);
		System.out.println(se);
	}

}
