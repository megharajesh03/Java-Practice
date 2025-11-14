package Day14;


public class Tiger {
//	Tiger(int x){
//		System.out.println("Tiger Object "+x);
//	}
	
	/*
//  public void tigerEat() {
    */
	
	public static void tigerEat() {
        System.out.println("Only non-veg");
    }

    public static void main(String[] args) {
    	/*
        Tiger t = new Tiger();
        Animal a = t::tigerEat;		// Reference to the instance method tigerEat
        a.eat(); 
        */
//    	Animal a = Tiger::new;		//Reference to constructor
//    	a.eat(5);
    	
    	Animal a = Tiger::tigerEat;	//Reference to static method
    	a.eat();
    }
}
