package Day11;
/*
public class TableB extends Thread {
	Table t;
	TableB(Table t){
		this.t =t;
	}
	public void run(){
		t.print(1000);
	}
}
*/
public class TableB extends Thread{
	public void run() {
		Table.print(1000);
	}
}