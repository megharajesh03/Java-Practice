package com.example;

import java.io.*;


/*
public class Demo {
	public static void main(String[] args) {
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter your name:");
		String name ="";
		try {
			name=dis.readLine();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Hai "+name+" Welcome!");
	}
}*/
public class Demo {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Eneter your name :");
		String name ="";
		try {
			name=br.readLine();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Hai "+name+" Welcome!");
	}
}

