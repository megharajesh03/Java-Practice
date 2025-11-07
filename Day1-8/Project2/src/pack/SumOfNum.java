package pack;

public class SumOfNum {
	public static void main(String[] args) {
		int num=5;
		/*
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		*/
		int sum = num*(num+1)/2;
		System.out.println("Sum is "+sum);
	}
}
