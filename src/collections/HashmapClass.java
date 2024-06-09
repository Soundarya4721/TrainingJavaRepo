package collections;

import java.util.HashMap;
import java.util.Map;

public class HashmapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1, "apple");
		map.put(2, "grapes");
		map.put(3, null);
		map.put(1, "orange");
		
		

		
		for(Map.Entry m:map.entrySet()) {
			
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		
		Map<String,String> map2=new HashMap<>();
		map2.put("name: ","Soundarya" );
		map2.put("Class: ", "Btech");
		map2.put("Number : ", "one");
		
		for(Map.Entry ma:map2.entrySet()) {
			
			
			System.out.println(ma.getKey()+" "+ma.getValue());
		}
 
	}

}
