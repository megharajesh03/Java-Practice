package Day9;

import java.io.*;
import java.util.Scanner;

public class User {
	/*
	public void disp() {
		System.out.println("disp");
	}
	public static void main(String[] args) {
		User u = null;
		u.disp();	//NullPointerException
	}
	*/
	
	/*
	public static void main(String[] args) {
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter name:");
		String name="";
		try {
			name = dis.readLine();
			
		}
		catch (IOException e){
			e.printStackTrace();
		}
		System.out.println("Hai "+name+" Welcome!");
	}
	*/
	
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		int a = sc.nextInt();
		if (a>=18) {
			System.out.println("Valid Age");
		}
		else {
			try {
				throw new InvalidAgeException(a);
			}
			catch( InvalidAgeException iae) {
				System.out.println(iae);
			}
		}
	}
	*/
	
	public static void main(String[] args) {
		int bal=10000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount:");
		int amt = sc.nextInt();
		if (amt<=10000) {
			bal-=amt;
			System.out.println("New balance is "+bal);
		}
		else {
			try {
				throw new NegativeAmountException(amt);
			}
			catch( NegativeAmountException iae) {
				System.out.println(iae);
			}
		}
	}
}
