package application;

import java.util.HashSet;
import java.util.Set;

public class App2 {

	public static void main(String[] args) {
		

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		Set<Integer>total = new HashSet<>(a);
		
		total.addAll(b);
		total.addAll(c);
		
		System.out.println(total.size());
		
		
	}

}
