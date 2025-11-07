//package pack.subpack;
//package outer;
package pack;

public class Calc {
public static void add(int x, int y) {
	System.out.println("The addition of "+x+" and "+y+" is "+(x+y));
	
}

/*private static void add(int x, int y) { 
	System.out.println("The addition of "+x+" and "+y+" is "+(x+y));
		
}

static void add(int x, int y) { //default
	System.out.println("The addition of "+x+" and "+y+" is "+(x+y));
		
}*/
public void sub(int x, int y) {
	System.out.println("The subtraction of "+x+" and "+y+" is "+(x-y));
	
}
public int mul(int x, int y) {
	return(x*y);
	
}
public static void main(String[] args) {
	Calc.add(22,33);
	Calc c=new Calc();
	c.sub(33,11);
	System.out.println(c.mul(22, 2));

}
}
