package com.demo;

import java.util.*;
public class ListDemo1 {

public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String>();
	al.add("Mango");
	al.add("Grape");
	al.add("Apple");
	al.add("Orange");
	al.add("Pineapple");
	al.add("Banaenae");
	/*
	for (String s:al) {
		System.out.println(s);
	}
	*/
	Iterator itr = al.iterator();
	while(itr.hasNext()) {
		System.out.println((String)itr.next());
	}
}
}
