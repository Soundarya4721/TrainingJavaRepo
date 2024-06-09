package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  List<Integer> arr=new ArrayList<Integer>();
	  
	  arr.add(1);
	  arr.add(2);
	  arr.add(4);
	  arr.add(7);
	  arr.add(2);

	  
	  for(int a : arr) {
		  
		  System.out.println(a);
	  }
	  
	  arr.remove(1);
	  System.out.println(arr.size());
	  
	  ArrayList<String> arrstr=new ArrayList<>();
	  arrstr.add("book");
	  arrstr.add("pen");
	  arrstr.add("slate");
	  arrstr.add("bag");
	  arrstr.add("slate");

	  for(String s:arrstr) {
		  
		  System.out.println(s);
	  }
	  
	 arrstr.clear(); //clear all the elements in the array list
	  
	  System.out.println("======================================");
	  
	  Iterator itr1=arrstr.iterator();
	  while(itr1.hasNext()) {
		  
		  System.out.println(itr1.next());
		  
	  }

	  ArrayList arr2=new ArrayList<>();
	  arr2.add(1);
	  arr2.add("hello");
	  arr2.add(1.2);
	  arr2.add('a');
	  arr2.add(1.2);
	  arr2.add(34);

	  
    Iterator itr=arr2.iterator();
    
    while(itr.hasNext()) {
    	System.out.println(itr.next());
    }
	  
	  
	  
	}

}
