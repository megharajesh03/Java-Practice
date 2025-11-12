package Day13;

import java.util.*;
//import java.util.function.Consumer;
import java.util.stream.Stream;

public class ListDemo {
	/*
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(2,1,5,6,2,8);
//		l.forEach(nums -> System.out.println(nums));	// "->" lambda expression
		l.forEach(new MyObject());
		
	}
	*/

	/*
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(2,1,5,6,2,8);
		Consumer <Integer> c = new Consumer <Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println("Data "+t);
			}
		};
		l.forEach(c);
		// (or)
		l.forEach(new MyObject()); //anonymous		
	}
	*/
	
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(2,1,5,6,2,8);
		Stream<Integer> s = l.stream();
		
		s.forEach(nums -> System.out.println(nums));
		
	}
}
