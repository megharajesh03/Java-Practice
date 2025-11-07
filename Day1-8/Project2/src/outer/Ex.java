package outer;

public class Ex {
int x=22;
/*
void disp(int x) {
	System.out.println("Local variable x is "+x);
	System.out.println("(using this keyword) Local variable x is "+this.x);
}
*/
void disp(int x) {
	this.x=x;
	System.out.println("Local variable x is "+this.x);
}

public static void main(String[] args) {
	Ex obj = new Ex();
	obj.disp(77);;
	System.out.println("Instance variable x is "+obj.x);
}
}
