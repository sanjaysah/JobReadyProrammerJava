package CollectionMethods_Comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Application3 {

	public static void main(String[] args) {
		// convert HashSet to List, sort using collections class for primitive generics
		HashSet<Employee> employees = new HashSet<Employee>();
		employees.add(new Employee("Martin", 1200, "maintenance"));
		employees.add(new Employee("Prince", 2200, "telecom"));
		employees.add(new Employee("Lucifer", 3200, "admin"));
		employees.add(new Employee("Mary", 4200, "IT"));
		employees.add(new Employee("Putin", 1600, "AI"));
		
		List<Employee> li = new ArrayList<Employee>(employees);
		
		System.out.println(li);
		
		// always ascending, to change it to descending change >, < in compareTo method
		Collections.sort(li); 
		
		System.out.println(li);
	}

}
