package Day13;

import java.io.*;

public class Demo1 {
	/*
	public static void main(String[] args) throws IOException {
//		FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\DemoFolder\\Demo.txt");
//		String str="Welcome to UST Healthproof";
//		byte b[]=str.getBytes();
//		fos.write(b);
//		System.out.println("Message written successfully.");
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\DemoFolder\\Demo.txt");
		int i=0;
		while((i=fis.read())!=-1) {	//read returns ascii value of each char
			System.out.print((char)i);
		}
		
		
	}*/
	
	public static void main(String[] args) throws IOException {
//		FileWriter fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\DemoFolder\\Demo.txt");
//		String str="Welcome to UST";
//		fw.write(str);
//		System.out.println("File written successfully");
//		fw.close();
		
		FileReader fr = new FileReader("C:\\Users\\Administrator\\Desktop\\DemoFolder\\Demo.txt");
		int i=0;
		while((i=fr.read())!=-1) {	
			System.out.print((char)i);
		}
		fr.close();
	}	
}
