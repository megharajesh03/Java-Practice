package Day11;
/*
public class Table {				//Method Level
	public void print(int x){
		for(int i=1;i<=5;i++){
			System.out.println(i*x);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
 */

/*
public class Table {
	public void print(int x){
		synchronized(this){		// Block level (or) Object Level Synchronization
			for(int i=1;i<=5;i++){
				System.out.println(i*x);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
 */
public class Table {
	public static synchronized void print(int x){
		for(int i=1;i<=5;i++){
			System.out.println(i*x);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
