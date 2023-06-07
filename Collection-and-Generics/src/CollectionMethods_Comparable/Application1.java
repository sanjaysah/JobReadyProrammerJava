package CollectionMethods_Comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Application1 {

	public static void main(String[] args) {
		// convert HashSet to List, sort using collections class for primitive generics
		HashSet<Integer> nums = new HashSet<Integer>();
		nums.add(12);
		nums.add(35);
		nums.add(12);
		nums.add(10);
		nums.add(63);
		
		List<Integer> li = new ArrayList<Integer>(nums);
		
		System.out.println(li);
		
		Collections.sort(li);
		
		System.out.println(li);
	}

}
