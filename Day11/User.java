package Day11;

public class User {
	public static void main(String[] args) {
		A th1= new A();
		B th2 = new B();		//Thread Object
		th1.start();
		th2.start();
		
//		A rn1 = new A();		//Runnable Object
//		Thread t1 = new Thread(rn1);
//		t1.start();
		
		/*
		//lambda expression
		Runnable rn=()->{System.out.println("Runnable Interface");};
		Thread th = new Thread(rn);
		th.start();
		*/
	}
}
