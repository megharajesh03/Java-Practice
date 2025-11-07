package pack.subpack;

public class StrDemo {
	/*
	public static void main(String[] args) {
		String str="Welcome";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		//String rev=sb.toString();
		String rev= String.valueOf(sb);
		System.out.println(rev);
	}
	*/
	
	/*
	public static void main(String[] args) {
		String str="Welcome";
		StringBuilder sb = new StringBuilder(str);
		sb.append(" to Java").append(" Programming");
		System.out.println(sb);
	}
	*/
	/*
	public static void main(String[] args) {
		char x='a';
		System.out.println((int)x);
		int y=66;
		System.out.println((char)y);
		String str="A";
		System.out.println(str.hashCode());
	}
	*/
	
	/*
	//Case conversion
	public static void main(String[] args) {
		String str="WeLcOmE";
		String str1="";
		int ascii=0;
		for (int i=0;i<str.length();i++) {
			ascii=(int)str.charAt(i);
			if (Character.isUpperCase(str.charAt(i))){				//Method1
				str1+= String.valueOf((char)ascii).toLowerCase();
			}
			else if (ascii>=97 && ascii<=129){						//Method2
				str1+= (char)(ascii-32);
			}
		}
		System.out.println(str1);
	}
	*/
	
	public static void main(String[] args) {
		String str="hellollollo";
		char[] ch = str.toCharArray();
		boolean[] b = new boolean[str.length()];
		
		for (int i=0;i<ch.length;i++) {
			if (b[i]) continue;
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if (ch[i]==ch[j]){
					count++;
					b[j]=true;
				}
			}
			System.out.println(ch[i]+" = "+count);
		}
	}
}
