package pack;

import java.util.Scanner;

public class Bin2Oct {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Binary number:");
		int num= sc.nextInt();
		int dec=0,i=0;
		while (num>0) {
			dec=dec+(num%10)*(int)Math.pow(2,i);
			num=num/10;
			i++;
		}
		//System.out.println(dec);
		String oct="";
		int r=0;
		while (dec>0) {
			r=dec%8;
			oct=r+oct;
			dec=dec/8;			
		}
		System.out.println(oct);
		sc.close();	
	}
}
