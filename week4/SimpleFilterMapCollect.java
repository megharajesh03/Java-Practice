//FunctionalProgramming
package week4;

import java.util.*;
import java.util.stream.Collectors;
public class SimpleFilterMapCollect {
public static void main(String[] args) {
	List<Integer> l=Arrays.asList(1,2,3,4,5);
	List<Integer> result = l.stream().filter(n->n%2==0).map(n->n*10).collect(Collectors.toList());
	System.out.println(result);
}
}
