package outer;

import java.util.Scanner;

public class ArrDemo {

	public static void main(String[] args) {
		/*
		int marks[]= {22,33,44,55,66};
		for (int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		
		for(int m:marks) {				//enhanced for loop
			System.out.println(m);
		}
		*/
		
		//method2
		int marks[]= new int[5];
		Scanner sc = new Scanner(System.in);
		int fail=0;
		for(int i=0;i<marks.length;i++) {
			System.out.println("Enter a mark:");
			marks[i]=sc.nextInt();
			if (marks[i]<40) {
				fail++;
			}
		}
		System.out.println("Failed "+fail+" subjects");
		System.out.println("Entered marks are:");
		int sum=0;
		for(int j=0;j<marks.length;j++) {
			System.out.println(marks[j]);
			sum+=marks[j];
		}
		int avg = sum/marks.length;
		System.out.println("Average: "+avg);
		sc.close();	
	}	
}
