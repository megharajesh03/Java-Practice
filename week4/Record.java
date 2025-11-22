//JDK8_21Features
package week4;

public class Record {
	record Product(String name,double price) {}
	public static void main(String[] args) {
		Product product = new Product("Air Fryer",85000.00);
		System.out.println(product.name()+" "+product.price());
	}
}

