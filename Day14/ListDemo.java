package Day14;

import java.util.*;

public class ListDemo {
	/*
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(33,11,55,2,5);
		l.forEach(System.out::println);			//
	}
	*/
	
	public static void display(String n) {
		System.out.println(n);
	}
	public static void main(String[] args) {
		String names[] = {"Arjun", "Rajesh", "Karthik", "Suman"};
		Arrays.stream(names).forEach(ListDemo::display);;
	}
	
}
