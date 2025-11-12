package Day11;

public class B extends Thread{
	 public void run() {
		 //System.out.println("Thread B is running.");
		 System.out.println(Thread.currentThread().getName()+" is running.");
	 }
}
