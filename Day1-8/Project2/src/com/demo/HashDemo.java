package com.demo;

import java.util.HashSet;
//import java.util.Stack;

public class HashDemo {
public static void main(String[] args) {
	HashSet al = new HashSet();  //same with LikedHashSet 			
	al.add("Mango");
	al.add(45);
	al.add('x');
	al.add(55.66f);
	al.add("Orange");			
	//al.set(2, "Apple");			//index based methods will throw error <1>
	System.out.println(al);
	//System.out.println(al.get(0)); // <1>
	//al.pop();						//doesnt support since unordered <2>
	al.remove('x'); 	
	System.out.println(al);
	//al.push("Banaenae");			// <2>
	//al.add(3,"Milk");				// <1>
	System.out.println(al);
	System.out.println(al.contains(45)); // finding element (returns true/false)
	System.out.println(al.size()); 	
}
}
