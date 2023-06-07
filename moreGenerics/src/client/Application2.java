package client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Application2 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		String string = "Sanjay";
		obj1 = string;
//		System.out.println(obj1);
		
		Employee employee = new Employee();
		Accountant acct = new Accountant();
		employee = acct;
		
		ArrayList<Employee> employee1 = new ArrayList<>();
		employee1.add(new Employee());
		ArrayList<Accountant> accountant1 = new ArrayList<>();
		accountant1.add(new Accountant());
//		employee1 = accountant1;  // assigning child to parent wont work here in generics
	
		ArrayList<Object> employee2 = new ArrayList<>();
//		employee2 = accountant1;  // assigning child to parent wont work here in generics
		
		ArrayList<?> employee3 = new ArrayList<>();
		employee3 = accountant1; // no error in assigning as we are using wilcard in generics
		
		ArrayList<?> employee4 = new ArrayList<>();
		ArrayList<String> strArrayList = new ArrayList<>();
		employee4 = strArrayList;
		
		//Upperbound generics to be more specific when use wildcard ? (bound by parent class)
		ArrayList<? extends Employee> employee5 = new ArrayList<>(); // here extend will work for interface too
		ArrayList<String> str2 = new ArrayList<>();
		ArrayList<Accountant> accountant2 = new ArrayList<>();
//		employee5 = str2;  // error, string is not child of employee
		employee5 = accountant2; // correct assignment, accountant2 is child of EMpolyee.
		
		//Lower bound generics, class or super classes are allowed when assigned
		ArrayList<? super Employee> employee6 = new ArrayList<>();
		ArrayList<Accountant> accountants3 = new ArrayList<>();
//		employee6 = accountants3; // Not allowed as accountant is not super class of Employee
		
		makeEmployeeWork(employee1);
		
		makeEmployeeWork(accountant1); //generics limitation, but if ? used will work for both still not able to differentiate 
		
	}
	
	static void makeEmployeeWork(List<? extends Employee> emp) {
		for (Employee emp1:emp) {
			emp1.work();
			
		}
	}

}
