package CollectionWithGenerics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		List<String> animals = new ArrayList<String>();
		animals.add("Lion");
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Bird");
		
		List<Vehicle> vehicles = new LinkedList<Vehicle>();
		
		vehicles.add(new Vehicle("Honda", "Accord", 12000, false));
		Vehicle camery = new Vehicle("Toyota", "Camery", 14000, true);
		vehicles.add(camery);
		vehicles.add(new Vehicle("Jeep", "Wrangler", 25000, true));
		
		printElements(vehicles);
		printElements(animals);
		
	}
	
	public static void printElements(List element) {
		for(int i=0;i<element.size();i++) {
			System.out.println(element.get(i));
		}
		System.out.println("--------------");
	}

}
