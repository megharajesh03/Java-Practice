package Day11;

//Check /bin/Day11 folder after execution
public class User1{
	public static void main(String[] args) {
//		Thread th1=new Thread() {
		new Thread() {
			public void run() {
				System.out.println("First Thread");
			}
		}.start();
		
//		Thread th2=new Thread() {
		new Thread() {
			public void run() {
				System.out.println("Second Thread");
			}
		}.start();
		
//		th1.start(); //Anonymous object
//		th2.start();
		
		//We can make multiple run() method in a class this way
		//if no reference, we need to call immediately
	}
}
