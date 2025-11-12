package Day13;

import java.io.*;

public class Demo {
	/*
	public static void main(String[] args) {
		File f1 = new File("C:\\Users\\Administrator\\Desktop\\MyFolder");
		f1.mkdir();
		System.out.println("Folder Created Successfully");
	}
	*/
	/*
	public static void main(String[] args) {
		File f1 = new File("C:\\Users\\Administrator\\Desktop\\MyFolder");
		File f2 = new File("C:\\Users\\Administrator\\Desktop\\DemoFolder");
		f1.renameTo(f2);
		System.out.println("Folder renamed");
	}
	*/
	
	public static void main(String[] args) {
		File f2 = new File("C:\\Users\\Administrator\\Desktop\\DemoFolder\\Demo.txt");
		try {
			f2.createNewFile();
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("File created");
	}
	
	
}