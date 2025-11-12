package Day11;

public class A extends Thread{
	public void run() {
		Thread t1 = Thread.currentThread();
		System.out.println("A Alive? :"+t1.isAlive());
		System.out.println(t1.getName()+"-> Thread A is running and its priority is "+t1.getPriority());
		
	}
}

/*
public class A implements Runnable{
	public void run() {
		System.out.println("Thread A is running.");
	}
}
*/