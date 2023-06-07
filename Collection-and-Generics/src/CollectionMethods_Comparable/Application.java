package CollectionMethods_Comparable;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(12);
		nums.add(35);
		nums.add(12);
		nums.add(10);
		nums.add(63);
		nums.add(47);
		nums.add(10);
		nums.add(35);
		
		ArrayList<Integer> nums1 = new ArrayList<Integer>();
		nums1.add(10);
		nums1.add(12);
		nums1.add(35);
		
		//nums.addAll(nums1);
		//nums.removeAll(nums1); // removes all entry of nums1 from nums
		//nums.clear(); // Clears all
		//System.out.println(nums.contains(10));
		//nums.retainAll(nums1);//only retain nums1 values
		
		System.out.println(nums);
	}

}
