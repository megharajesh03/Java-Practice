//FunctionalProgramming
package week4;

import java.util.function.Predicate;
public class Predicates {
public static void main(String[] args) {
	Predicate<String> isValidUserName=name->name.length()>5;
	System.out.println(isValidUserName.test("Megha"));
	System.out.println(isValidUserName.test("Meg"));
}
}
