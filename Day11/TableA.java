package Day11;

/*
//public class TableA {

public class TableA extends Thread {
	Table t;
	TableA(Table t){
		this.t=t;
	}
//	public void disp(){
//		t.print(5);
//	}
	
	public void run(){
		t.print(100);
	}
}
*/

public class TableA extends Thread{
	public void run() {
		Table.print(100);
	}
}