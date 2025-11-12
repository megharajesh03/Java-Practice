package Day11;
/*
public class TableUser {					// You can use this for Object level as well
	public static void main(String[] args) {

		Table tbl=new Table();
		TableA th1=new TableA(tbl);
		TableB th2=new TableB(tbl);		//Method Level Synchronization
//		a.disp()

		th1.start();
		th2.start();

	}
}
*/

public class TableUser {			//Static Level
	public static void main(String[] args) {

		TableA th1=new TableA();
		TableB th2=new TableB();		
		th1.start();
		th2.start();

	}
}
