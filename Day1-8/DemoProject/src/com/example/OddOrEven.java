package com.example;

import javax.swing.JOptionPane;

public class OddOrEven {
public static void main(String[] args) {
	int a=Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
	if (a%2==0) {
		JOptionPane.showMessageDialog(null, a+" is even");
	}
	else {
		JOptionPane.showMessageDialog(null, a+" is odd");

	}
}
}
