package pack.subpack;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapDemo {
	/*
	public static void main(String[] args) {
		HashMap hm = new HashMap();		//unordered
		hm.put(3, "Mango");
		hm.put('x',33.44f);
		hm.put("A", 55);
		hm.put(3, "Apple");
		hm.put("", 32);
		System.out.println(hm);
		System.out.println(hm.get('x'));
		System.out.println(hm.remove(3));//returns removed value
		System.out.println(hm);
	}
	*/
	public static void main(String[] args) {
		LinkedHashMap hm = new LinkedHashMap(); //ordered
		hm.put(3, "Mango");
		hm.put(4,"Orange");
		hm.put(2, "Apple");
		hm.put(3, "Apple");
		hm.put(1, "Banaenae");
		System.out.println(hm);
		// same methods as HashedMap
		System.out.println(hm.containsKey("A"));	//boolean
		
		
		
		
		
		
		
		

	}
}
