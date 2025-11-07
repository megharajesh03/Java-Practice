package pack.subpack;

public class StrEx1 {
	public static void main(String[] args) {
		String str="racecar";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);	
		}
		if (rev==str) {
			System.out.println("Palidrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}