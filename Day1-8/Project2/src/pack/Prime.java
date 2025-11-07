package pack;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num= sc.nextInt();
		sc.close();	
		for (int i=2; i<=(Math.sqrt(num)); i++) {
			if (num%i == 0) {
				System.out.println("Not prime");
				//System.exit(0);
				return;
			}
		}
		System.out.println("Prime");
	}
}