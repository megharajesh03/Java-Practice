package pack;

import java.util.Scanner;

public class Bin2Hex {
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
		String hex="";
		int r=0;
		while (dec>0) {
			r=dec%16;
			if (r>9) {
				if (r==10) {
					hex=hex+'A';
				}
				else if (r==11) {
					hex=hex+'B';
				}
				else if (r==12) {
					hex=hex+'C';
				}
				else if (r==13) {
					hex=hex+'D';
				}
				else if (r==14) {
					hex=hex+'E';
				}
				else if (r==15) {
					hex=hex+'F';
				}
			}
			else {
				hex=r+hex;
			}
			dec=dec/16;			
		}
		System.out.println(hex);
		sc.close();	
	}
}
