package Day11;

public class User3 {
	public static void main(String[] args) {
		A th1= new A();
		B th2 = new B();
		th1.setName("First Thread");
		th2.setName("Second Thread");
		th2.setPriority(10);
		th1.start();
		th2.start();
		
	}
}
