package outer;

import java.util.Scanner;

public class ArrDemo2 {
	public static void main(String[] args) {
		int arr[][] = new int[2][3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("Enter a number:");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The matrix:");
		for(int x=0;x<2;x++) {
			for(int y=0;y<3;y++) {
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
		}
		sc.close();		
	}
}
