package pack.subpack;

import pack.Calc;

public class A {
	public static void main(String[] args) {
		Calc.add(20,30);

	}
}

/*
public class A extends Calc { //protected
	public static void main(String[] args) {
		Calc.add(20,30);	//protected static void add(){}
		
		A a=new A();		//object for child class
		a.sub(22,30);		//protected void sub(){}

	}
}
*/