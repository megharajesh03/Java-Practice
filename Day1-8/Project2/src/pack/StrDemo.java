package pack;

public class StrDemo {
	public static void main(String[] args) {
		String str1="Welcome";
		System.out.println(str1.replace('e', 'x'));
		System.out.println(str1.repeat(3));
		
		//reversing string
		String rev="";
		for(int i=str1.length()-1;i>=0;i--) {
			rev+=str1.charAt(i);	
		}
		System.out.println(rev);
		
		//splitting and storing into an array
		String str2="Welcome to Java Programming";
		String arr[]=str2.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}

