package Day11;
//This way you can make multiple runnable
public class User2 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				System.out.println("Runnable object");
			}
		}).start();
	}
}
