//FunctionalProgramming
package week4;

import java.util.function.Consumer;

public class Consumers {
public static void main(String[] args) {
	Consumer<Integer>printSquare = n-> System.out.println("Square:"+n*n);
	printSquare.accept(5);
}
}