package client;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.print.attribute.IntegerSyntax;

public class Application {

	public static void main(String[] args) {
		
		Container<Integer, String> ctr1 = new Container<>(10, "Darsh");
		
		int val1 = ctr1.getItem1();
		String val2 = ctr1.getItem2();
		
		ctr1.printItems();
		
		Set<String> set1 = new HashSet<>();
		set1.add("first");
		set1.add("second");
		set1.add("whatever");
		
		Set<String> set2 = new HashSet<>();
		set1.add("first");
		set1.add("second");
		set1.add("However");
		
		Set<String> result = union(set1, set2);
	
		Iterator<String> itr = result.iterator();
		while(itr.hasNext()) {
			String val = itr.next();
			System.out.println(val);
			
		}
		
	}
	
	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		Set<E> result = new HashSet<>(set1);
		result.addAll(set2);
		return result;
	}

}
