package com.demo;

//import java.util.ArrayList;
//import java.util.Vector;
import java.util.*;

public class ListDemo {
	public static void main(String[] args) {
		//ArrayList al = new ArrayList();
		Stack al = new Stack();  			//do same with Vector and LinkedList
		al.add("Mango");
		al.add(45);
		al.add('x');
		al.add(55.66f);
		al.add("Orange");
		//al.remove(1); 		//to delete
		al.set(2, "Apple");
		System.out.println(al);
		System.out.println(al.get(0));
		al.pop();							//if used it LL it removes first element (but in stack it is last element)
		System.out.println(al);
		al.push("Banaenae");
		al.add(3,"Milk");
		System.out.println(al);
		System.out.println(al.contains(45)); // finding element (returns true/false)
		System.out.println(al.size()); 		 // No. of elements
	}
}
