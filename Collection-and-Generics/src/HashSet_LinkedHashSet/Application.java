package HashSet_LinkedHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Application {

	public static void main(String[] args) {
		//Hashset does not maintains insertion order but Linked HashSet maintains the same.
		HashSet<Animal> animals = new HashSet<Animal>();
		
		Animal animal1 = new Animal("Dog", 12);
		Animal animal2 = new Animal("Bird", 2);
		Animal animal3 = new Animal("Cat", 4);
		Animal animal4 = new Animal("Dog", 12);
		
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		
		/*
		 * //Duplicate is not caught because hashcode is not same for animal dog age 12
		 * duplicate 
		 * System.out.println(animal1.hashCode());
		 * System.out.println(animal4.hashCode());
		 * System.out.println(animal1.equals(animal4)); //false cause hashcode not same
		 * //2060468723 
		 * //112810359
		 *  //false
		 */		
		
		/*
		 * //if overwritten equals and hashcode method of Object class, duplicate caught
		 * by HashSet System.out.println(animal1.hashCode());
		 * System.out.println(animal4.hashCode());
		 * System.out.println(animal1.equals(animal4)); 
		 * 70225 
		 * 70225 
		 * true 
		 * Animal [name=Dog, age=12] 
		 * Animal [name=Cat, age=4] 
		 * Animal [name=Bird, age=2]
		 */
		
		for (Animal animal : animals) {
			System.out.println(animal);
		}
		
		//Insertion order maintained
		LinkedHashSet<Integer> numberSet = new LinkedHashSet<Integer>();
		numberSet.add(12);
		numberSet.add(121);
		numberSet.add(16);
		numberSet.add(145);
		numberSet.add(12);
		numberSet.add(12);
		
		for (Integer nums : numberSet) {
			System.out.println(nums);
		}
	}

}
