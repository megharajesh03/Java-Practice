package pack;

import java.util.Scanner;

public class Dec2Bin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num= sc.nextInt();
		String binary="";
		int r=0;
		while (num>0) {
			r=num%2;
			binary=r+binary;
			num=num/2;			
		}
		System.out.println(binary);
		sc.close();	
	}
}
