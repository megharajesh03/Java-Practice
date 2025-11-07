package com.example;

import javax.swing.JOptionPane;
//import javax.swing.JButton;

public class User {
	public static void main(String[] args) {
	//	Dog d1=new Dog();
	//	d1.eat();
	//	Dog.main(null);
	//	JButton jb=new JButton("Click Me");
	
	//	String name=JOptionPane.showInputDialog("Enter your name:");
	//	JOptionPane.showMessageDialog(null, "Hai "+name+" Welcome");
		
		int s1=Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
		int s2=Integer.parseInt(JOptionPane.showInputDialog("Enter another number:"));
		JOptionPane.showMessageDialog(null, "The addition is"+(s1+s2));
		
	}

}
