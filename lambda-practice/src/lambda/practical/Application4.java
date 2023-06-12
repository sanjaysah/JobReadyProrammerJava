package lambda.practical;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

// Use of existing Functional Interfaces provided by Java e.g. Predicate
public class Application4 {

	public static void main(String[] args) {
		List<Car> cars = Arrays.asList(
			new Car("Honda", "Accord", "Red", 22300),
			new Car("Honda", "Civic", "Blue", 17700),
			new Car("Toyota", "Land Cruiser", "White", 48500),
			new Car("Toyota", "Corolla", "Black", 16200),
			new Car("Toyota", "Camry", "Blue", 24000),
			new Car("Nissan", "Sentra", "White", 17300),
			new Car("Mitshubishi", "Lancer", "White", 20000),
			new Car("Jeep", "Wrangler", "White", 24500)
			);
		
		//Usage of existing FunctionalInterface - Function(T,R)
		Function<Car, String> priceAndColor = (c) -> "Price: "+c.getPrice()+" Color: "+c.getColor();
		String stringCar = priceAndColor.apply(cars.get(0));
		System.out.println(stringCar);
	}
	
	public static void printCars(List<Car> cars, Predicate<Car> predicate) {
		for(Car c: cars) {
			if(predicate.test(c)) {
				System.out.println(c.printCar());
			}
		}
	}
	
}
