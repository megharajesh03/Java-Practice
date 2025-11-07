//Exception handling
package Day9;

/*
public class Ex {
public static void main(String[] args) {
	int x=22;
	int y=0;
	try {
		System.out.println("Welcome to Divison Program");
		System.out.println("Division of "+x+" / "+y+" is "+x/y);
	}
	catch (Exception e) {
		System.out.println("Please enter a non zero value "+e);
	}
	System.out.println("Bye lol");
}
}
*/

public class Ex {
	public static int arr[]= new int[5];
	public static void div(int x, int y) throws ArithmeticException {
		arr[0]=22;
		arr[1]=33;
//		try {
//		System.out.println("Division of "+x+" / "+y+" is "+x/y);
//		arr[11]=77;
//		}
//		catch (Exception e) {
//			System.out.println(" "+e);
//		}
		
		
		try {
			System.out.println("Division of "+x+" / "+y+" is "+x/y);
			//throw new NullPointerException();
		}
		/*
		catch (ArithmeticException e) {
			System.out.println("Please enter a non zero value "+e);
		}
		
		try {
			arr[11]=77;
		}
		catch (ArrayIndexOutOfBoundsException aioob) {
			//aioob.printStackTrace();
			System.out.println(aioob.getMessage());
		}
		*/
		finally {
			System.out.println("Closing...");
		}
		
		
		/*
		try { 
			System.out.println("Division of "+x+" / "+y+" is "+x/y); //outer level problem= will not connect to inner level
			
			try {														//nested try
				arr[11]=77;
			}
			catch (ArrayIndexOutOfBoundsException aioob) {
				//aioob.printStackTrace();
				System.out.println(aioob.getMessage());
			}
		}
		catch (ArithmeticException e) {
			System.out.println("Please enter a non zero value "+e);
		}
		*/
	}
	public static void main(String[] args) {
		int x=22;
		int y=0;
		System.out.println("Welcome!");
		Ex.div(x, y);
		System.out.println("Bye...");
	}
}
